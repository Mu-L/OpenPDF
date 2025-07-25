package org.openpdf.text.pdf.table;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.openpdf.text.Cell;
import org.openpdf.text.Document;
import org.openpdf.text.PageSize;
import org.openpdf.text.Phrase;
import org.openpdf.text.Table;
import org.openpdf.text.alignment.VerticalAlignment;
import org.openpdf.text.pdf.PdfWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

public class TableEndlessTest {

    /**
     * Bug fix scenario: a table with setting alignment as bottom enters endless loop
     */
    @Test
    void testNoEndlessLoopWithBottom() {
        assertTimeout(ofSeconds(10), () -> {
            Document document = new Document(PageSize.A4);
            PdfWriter writer = PdfWriter.getInstance(document, Files.newOutputStream(Paths.get("test.pdf")));
            Table table = new Table(2);
            Cell cell1 = new Cell("any text");
            cell1.setVerticalAlignment(VerticalAlignment.BOTTOM);
            table.addCell(cell1);
            StringBuilder largeStr = new StringBuilder();
            for (int i = 0; i < 45; i++) {
                largeStr.append(String.format("this is to test-> row %d\n", i));
            }
            Cell cell2 = new Cell(new Phrase(largeStr.toString()));
            table.addCell(cell2);
            document.open();
            document.add(table);
            document.close();
        });
    }

    /**
     * Bug fix scenario: a table with setting alignment as center enters endless loop
     */
    @Test
    void testNoEndlessLoopWithCenter() {
        assertTimeout(ofSeconds(10), () -> {
            Document document = new Document(PageSize.A4);
            PdfWriter writer = PdfWriter.getInstance(document, Files.newOutputStream(Paths.get("test.pdf")));
            Table table = new Table(2);
            Cell cell1 = new Cell("any text\nany text\nany text");
            cell1.setVerticalAlignment(VerticalAlignment.CENTER);
            table.addCell(cell1);
            StringBuilder largeStr = new StringBuilder();
            for (int i = 0; i < 86; i++) {
                largeStr.append(String.format("this is to test-> row %d\n", i));
            }
            Cell cell2 = new Cell(new Phrase(largeStr.toString()));
            table.addCell(cell2);
            document.open();
            document.add(table);
            document.close();
        });
    }
}
