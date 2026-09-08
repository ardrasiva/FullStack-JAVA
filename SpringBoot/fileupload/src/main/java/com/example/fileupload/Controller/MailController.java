package com.example.fileupload.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Controller;

@Controller
public class MailController {

    @Autowired
    private JavaMailSender sender;

    public void sendEmail(String fileName) {

        try {

            SimpleMailMessage msg = new SimpleMailMessage();

            msg.setTo("test@example.com");

            msg.setSubject("File Uploaded Successfully");

            msg.setText(
                    "The file was uploaded successfully.\n"
                    + "File Name: " + fileName
            );

            sender.send(msg);

        } catch (MailException ex) {

            System.err.println(ex.getMessage());

            throw ex;
        }
    }
}