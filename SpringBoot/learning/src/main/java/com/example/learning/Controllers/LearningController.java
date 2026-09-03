package com.example.learning.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LearningController {
    @GetMapping("/home")
    public String Home(Model model)
    {
        String WelcomeMsg = "Learning is the Greatest tool!";
        String HeadingMsg ="<h1>Hello from Spring Boot!</h1>";
        boolean isLoggedIn = true;

        model.addAttribute("WelcomeMsg",WelcomeMsg);
        model.addAttribute("HeadingMsg",HeadingMsg);
        model.addAttribute("isLoggedIn",isLoggedIn);
        return "home";
    }
}
