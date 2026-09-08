package com.example.fileupload.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileUploadController {

    private static String UPLOADED_FOLDER = "uploads/";

    @Autowired
    private MailController mailController;

    @GetMapping("/uploadFile")
    public String showUploadPage() {
        return "upload";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(
            @RequestParam("file") MultipartFile file,
            Model model) {

        if (file.isEmpty()) {

            model.addAttribute(
                    "message",
                    "Please select a file to upload."
            );

            return "upload";
        }

        try {

            Path uploadPath = Paths.get(UPLOADED_FOLDER);

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            byte[] bytes = file.getBytes();

            Path path = Paths.get(
                    UPLOADED_FOLDER + file.getOriginalFilename()
            );

            Files.write(path, bytes);

            // Send confirmation email
            System.out.println(">>> SENDING EMAIL FOR: " + file.getOriginalFilename());
            mailController.sendEmail(file.getOriginalFilename());

            model.addAttribute(
                    "message",
                    "You successfully uploaded '"
                    + file.getOriginalFilename()
                    + "' and confirmation email was sent."
            );

        } catch (Exception e) {

            model.addAttribute(
                    "message",
                    "Failed to upload '"
                    + file.getOriginalFilename()
                    + "' -> "
                    + e.getMessage()
            );
        }

        return "upload";
    }
}