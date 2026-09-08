package com.example.bookpdf.Controllers;

import jakarta.servlet.http.HttpServletResponse;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookPdfController {

    @GetMapping("/generate-book-pdf")
    public void generateBookPdf(HttpServletResponse response) throws Exception {

        // Default book details
        String title = "The Alchemist";
        String author = "Paulo Coelho";
        String description = "A story about following your dreams and finding your purpose.";
        String price = "399";
        String publishedDate = "1988-01-01";

        response.setContentType("application/pdf");

        response.setHeader(
                "Content-Disposition",
                "attachment; filename=book.pdf"
        );

        try (PDDocument document = new PDDocument()) {

            PDPage page = new PDPage();

            document.addPage(page);

            try (PDPageContentStream contentStream =
                    new PDPageContentStream(document, page)) {

                // Heading
                contentStream.setFont(
                        PDType1Font.HELVETICA_BOLD,
                        18
                );

                contentStream.beginText();

                contentStream.newLineAtOffset(50, 750);

                contentStream.showText("Book Details");

                contentStream.endText();

                // Book details
                contentStream.setFont(
                        PDType1Font.HELVETICA,
                        12
                );

                int yPosition = 710;

                contentStream.beginText();
                contentStream.newLineAtOffset(50, yPosition);
                contentStream.showText("Title: " + title);
                contentStream.endText();

                yPosition -= 25;

                contentStream.beginText();
                contentStream.newLineAtOffset(50, yPosition);
                contentStream.showText("Author: " + author);
                contentStream.endText();

                yPosition -= 25;

                contentStream.beginText();
                contentStream.newLineAtOffset(50, yPosition);
                contentStream.showText("Description: " + description);
                contentStream.endText();

                yPosition -= 25;

                contentStream.beginText();
                contentStream.newLineAtOffset(50, yPosition);
                contentStream.showText("Price: " + price);
                contentStream.endText();

                yPosition -= 25;

                contentStream.beginText();
                contentStream.newLineAtOffset(50, yPosition);
                contentStream.showText("Published Date: " + publishedDate);
                contentStream.endText();
            }

            document.save(response.getOutputStream());
        }
    }

    @GetMapping("/book")
    public String bookPage() {
        return "book";
    }
}