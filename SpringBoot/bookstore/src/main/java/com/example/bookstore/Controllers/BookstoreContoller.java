package com.example.bookstore.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookstoreContoller {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("/books")
    public String books(Model model) {
        String title = "Mercury Island";
        String author = "Akhil P Dharmajan";
        float price = 399.0f;

        model.addAttribute("title", title);
        model.addAttribute("author", author);
        model.addAttribute("price", price);
        return "books";
    }
    
    
}
