package org.openpdf.text.pdf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.openpdf.text.Annotation;
import org.openpdf.text.Document;
import org.openpdf.text.PageSize;
import org.openpdf.text.Paragraph;
import org.openpdf.text.Rectangle;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.file.Files;
import org.junit.jupiter.api.Test;

public class SimplePdfTest {

    @Test
    void testSimplePdf() throws Exception {
        // create document
        Document document = PdfTestBase.createTempPdf("testSimplePdf.pdf");
        try {
            // new page with a rectangle
            document.open();
            document.newPage();
            Annotation ann = new Annotation("Title", "Text");
            Rectangle rect = new Rectangle(100, 100);
            document.add(ann);
            document.add(rect);
        } finally {
            // close document
            if (document != null) {
                document.close();
            }
        }

    }

    @Test
    void testTryWithResources_with_os_before_doc() throws Exception {
        try (PdfReader reader = new PdfReader("./src/test/resources/HelloWorldMeta.pdf");
                FileOutputStream os = new FileOutputStream(Files.createTempFile("temp-file-name", ".pdf").toFile());
                Document document = new Document()
        ) {
            PdfWriter writer = PdfWriter.getInstance(document, os);
            document.open();
            final PdfContentByte cb = writer.getDirectContent();

            document.newPage();
            PdfImportedPage page = writer.getImportedPage(reader, 1);
            cb.addTemplate(page, 1, 0, 0, 1, 0, 0);
        }
    }

    @Test
    void testTryWithResources_with_unknown_os() throws Exception {
        try (PdfReader reader = new PdfReader("./src/test/resources/HelloWorldMeta.pdf");
                Document document = new Document()
        ) {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(File.createTempFile("temp-file-name", ".pdf")));
            document.open();
            final PdfContentByte cb = writer.getDirectContent();

            document.newPage();
            PdfImportedPage page = writer.getImportedPage(reader, 1);
            cb.addTemplate(page, 1, 0, 0, 1, 0, 0);
        }
    }

    @Test
    void testDocumentId() throws Exception {
        byte[] docBytes = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
                Document document = new Document(PageSize.A4)) {
            PdfWriter pdfWriter = PdfWriter.getInstance(document, baos);
            document.open();
            document.add(new Paragraph("This is a simple PDF"));
            document.close();
            pdfWriter.close();
            docBytes = baos.toByteArray();
        }

        try (InputStream is = new ByteArrayInputStream(docBytes);
                PdfReader reader = new PdfReader(is)) {
            byte[] documentId = reader.getDocumentId();
            assertNotNull(documentId);

            PdfArray idArray = reader.getTrailer().getAsArray(PdfName.ID);
            assertEquals(2, idArray.size());
            assertArrayEquals(idArray.getPdfObject(0).getBytes(), idArray.getPdfObject(1).getBytes());
            assertArrayEquals(documentId, org.openpdf.text.DocWriter.getISOBytes(idArray.getPdfObject(0).toString()));
            assertArrayEquals(documentId, org.openpdf.text.DocWriter.getISOBytes(idArray.getPdfObject(1).toString()));
        }

    }

}
