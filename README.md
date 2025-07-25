# OpenPDF is an open source Java library for PDF files

OpenPDF is a Java library for creating and editing PDF files with a LGPL and MPL open source
license. OpenPDF is the LGPL/MPL open source successor of iText, and is based on some forks of iText
4 svn tag. OpenPDF-html allows making PDF files from HTML.
We welcome contributions from other developers. Please feel free to submit pull-requests
and bugreports to this GitHub repository.

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.librepdf/openpdf/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.librepdf/openpdf)
![CI](https://github.com/LibrePDF/OpenPDF/actions/workflows/maven.yml/badge.svg)
[![License (LGPL version 2.1)](https://img.shields.io/badge/license-GNU%20LGPL%20version%202.1-blue.svg?style=flat-square)](http://opensource.org/licenses/LGPL-2.1)
[![License (MPL)](https://img.shields.io/badge/license-Mozilla%20Public%20License-yellow.svg?style=flat-square)](http://opensource.org/licenses/MPL-2.0)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/791d40a437f64c77a0a802ae597a960c)](https://app.codacy.com/gh/LibrePDF/OpenPDF/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)
[![Codacy Badge](https://app.codacy.com/project/badge/Coverage/791d40a437f64c77a0a802ae597a960c)](https://app.codacy.com/gh/LibrePDF/OpenPDF/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_coverage)
[![CodeQL](https://github.com/LibrePDF/OpenPDF/actions/workflows/codeql.yml/badge.svg)](https://github.com/LibrePDF/OpenPDF/actions/workflows/codeql.yml)
[![CodeFactor](https://www.codefactor.io/repository/github/librepdf/openpdf/badge)](https://www.codefactor.io/repository/github/librepdf/openpdf)
[![Join the chat at https://gitter.im/LibrePDF/OpenPDF](https://badges.gitter.im/LibrePDF/OpenPDF.svg)](https://gitter.im/LibrePDF/OpenPDF)
![Java 17](https://img.shields.io/badge/Java-17-blue?logo=java&logoColor=white)
![Java 21](https://img.shields.io/badge/Java-21-blue?logo=java&logoColor=white)
![Java 24](https://img.shields.io/badge/Java-24-blue?logo=java&logoColor=yellow)
[![Kotlin](https://img.shields.io/badge/Kotlin-Supported-7F52FF?logo=kotlin&logoColor=white)](https://github.com/LibrePDF/OpenPDF/tree/master/openpdf-kotlin)

## OpenPDF version 2.2.4 released 2025-07-01

Get version 2.2.4 here: https://github.com/LibrePDF/OpenPDF/releases/tag/2.2.4

### Other versions

- [OpenPDF 1.4.2 (release 2024-03-30)](https://github.com/LibrePDF/OpenPDF/releases/tag/1.4.2)
- [Previous releases](https://github.com/LibrePDF/OpenPDF/releases)

## Features

Some of the features of OpenPDF include:

* [Openpdf](openpdf-core-modern) Creating PDFs: You can use OpenPDF to create new PDF documents from scratch.
* Manipulating Existing PDFs: OpenPDF allows you to modify existing PDF documents by adding or removing pages, modifying
  text, and more.
* [Openpdf-html](openpdf-html) Create PDF files from HTML, using OpenPDF-html which is a fork of Flying Saucer.
* [Openpdf-renderer](openpdf-renderer) Render PDF files as images using openpdf-render.
* [Openpdf-kotlin](openpdf-kotlin) Kotlin module for easy creation of PDF files using Kotlin.
* Text and Font Support: You can add text to PDF documents using various fonts and styles, and extract text from PDF
  files.
* Graphics and Images: OpenPDF supports the addition of images and graphics to PDF files.
* Table Support: The library facilitates the creation of tables in PDF documents.
* Encryption: You can encrypt PDF documents for security purposes.
* Page Layout: OpenPDF allows you to set the page size, orientation, and other layout properties.

## Use OpenPDF as Maven dependency

Add this to your pom.xml file to use the latest version of OpenPDF:

```xml

<dependency>
  <groupId>com.github.librepdf</groupId>
  <artifactId>openpdf</artifactId>
  <version>2.2.4</version>
</dependency>
```

## License

OpenPDF uses dual licensing: when using the library, you may choose either Mozilla Public License Version 2.0
or GNU Lesser General Public License 2.1.

The SPDX license identifier for OpenPDF licensing is `MPL-2.0 OR LGPL-2.1+`

[GNU Lesser General Public License (LGPL), Version 2.1](https://www.gnu.org/licenses/old-licenses/lgpl-2.1)

> For a short explanation see https://en.wikipedia.org/wiki/GNU_Lesser_General_Public_License

[Mozilla Public License Version 2.0](http://www.mozilla.org/MPL/2.0/)

> For a short explanation see https://en.wikipedia.org/wiki/Mozilla_Public_License

You can find also a nice explanation of these licenses under https://itsfoss.com/open-source-licenses-explained/

We want OpenPDF to consist of source code which is consistently licensed with the LGPL and MPL
licences only. This also means that any new contributions to the project must have a dual LGPL and
MPL license only.

## Documentation

- [Examples](pdf-toolbox/src/test/java/com/lowagie/examples)
- [JavaDoc](https://javadoc.io/doc/com.github.librepdf/openpdf/latest/index.html)
- [Tutorial](https://github.com/LibrePDF/OpenPDF/wiki/Tutorial) (wiki, work in progress)
- [Migration from iText, TIFF support](https://github.com/LibrePDF/OpenPDF/wiki/Migrating-from-iText-2-and-4)

## Background

OpenPDF is open source software with a LGPL and MPL license. It is a fork of iText version 4, more
specifically iText svn tag 4.2.0, which was hosted publicly on sourceforge with LGPL and MPL license
headers in the source code, and LGPL and MPL license documents in the svn repository. Beginning with
version 5.0 of iText, the developers have moved to the AGPL to improve their ability to sell
commercial licenses.

OpenPDF ancestors in GitHub (in fork order):

1. [@rtfarte](https://github.com/rtfarte) / [OpenPDF](https://github.com/rtfarte/OpenPDF) - parent
   of LibrePDF/OpenPDF
2. [@kulatamicuda](https://github.com/kulatamicuda)
   / [iText-4.2.0](https://github.com/kulatamicuda/iText-4.2.0)
3. [@daviddurand](https://github.com/daviddurand)
   / [iText-4.2.0](https://github.com/daviddurand/iText-4.2.0)
4. [@ymasory](https://github.com/ymasory) / [iText-4.2.0](https://github.com/ymasory/iText-4.2.0) -
   original parent on GitHub

## Security Notice

It is the responsibility of the application developer to ensure that all input passed into OpenPDF is trusted,
sanitized, and safe.
OpenPDF does not perform input validation or enforce sandboxing. For important security guidelines and common risks,
please read our [Security Policy](Security.md).

## Android

OpenPDF can be used with Android, more info
here: [Android-support](https://github.com/LibrePDF/OpenPDF/wiki/Android-support)

## Contributing

Release the hounds!  Please send all pull requests. Make sure that your contributions can be
released with a dual LGPL and MPL license. In particular, pull requests to the OpenPDF project must
only contain code that you have written yourself. GPL or AGPL licensed code will not be acceptable.

To contribute code to the OpenPDF project, your GitHub account must contain your real name, so that
we can verify your identity. This is to ensure the trust, security and integrity of the OpenPDF
project, and to prevent security incidents such as the "XZ Utils backdoor". Knowning the real name
of the contributors will also identify and prevent conflict of interests.

More details: [Contributing](CONTRIBUTING.md)

### Coding Style

- Code indentation style is 4 spaces. Maximum line length is 120 characters.
- Generally try to preserve the coding style in the file you are modifying.

## Dependencies

### Required Dependencies

We have now different versions of OpenPDF, and they require different versions of Java:

- The 2.1.x Branch requires Java 21 or later.
- The 2.0.x Branch requires Java 17 or later.
- The 1.4.x Branch requires Java 11 or later.
- The 1.3.x Branch requires Java 8 or later.


### OpenPDF Java package name change from com.lowagie to org.openpdf

* [Openpdf-core-legacy](openpdf-core-legacy) - Maven artifactId: openpdf. This is the legacy OpenPDF core package, 
  which uses the old Java package name `com.lowagie`. This will be removed in the future, so please migrate.
* [Openpdf-core-modern](openpdf-core-modern) - Maven artifactId: openpdf-core-modern. This is the modern OpenPDF 
  core package, which uses the new Java package name `org.openpdf`. This is the recommended package to use in new code.

### UTF-8 Fonts

As of 1.3.21 the UTF-8 Liberation fonts moved to its own module, to reduce the size of the OpenPDF
jar. If you want to use the bundled UTF-8 fonts, please add the following dependency to your project
and use the class `org.librepdf.openpdf.fonts.Liberation`.

```xml

<dependency>
  <groupId>com.github.librepdf</groupId>
  <artifactId>openpdf-fonts-extra</artifactId>
  <version>${openpdf.version}</version>
</dependency>
```

### Supporting complex glyph substitution/ Ligature substitution

OpenPDF supports glyph substitution which is required for correct rendering of fonts ligature substitution requirements.
FOP dependency is required to enable this feature. Refer following wiki for
details: [wiki](https://github.com/LibrePDF/OpenPDF/wiki/Multi-byte-character-language-support-with-TTF-fonts)

### Supporting OpenType layout, glyph positioning, reordering and substitution

OpenPDF supports OpenType layout, glyph positioning, reordering and substitution which is e.g. required for correct
positioning of accents, the rendering of non-Latin and right-to-left scripts. OpenPDF supports DIN 91379.
See: [wiki](https://github.com/LibrePDF/OpenPDF/wiki/Accents,-DIN-91379,-non-Latin-scripts)

### Optional

- [BouncyCastle](https://www.bouncycastle.org/) (BouncyCastle is used to sign PDF files, so it's a recommended
  dependency)
  - Provider (`org.bouncycastle:bcprov-jdk18on` or `org.bouncycastle:bcprov-ext-jdk18on` depending
    on which algorithm you are using)
  - PKIX/CMS (`org.bouncycastle:bcpkix-jdk18on`)
- Apache FOP (`org.apache.xmlgraphics:fop`)
- Please refer to our [pom.xml](pom.xml) to see what version is needed.

## Credits

Please see [Contributors.md](Contributors.md).
