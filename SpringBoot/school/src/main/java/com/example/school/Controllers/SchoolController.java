package com.example.school.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/product-details")
    public String productDetails() {
        return "product-details";
    }
}
