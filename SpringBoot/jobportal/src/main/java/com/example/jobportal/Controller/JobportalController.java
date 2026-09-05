package com.example.jobportal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.jobportal.Model.Jobportal;


@Controller 
public class JobportalController {

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    
    @PostMapping("/register")
    public String registerForm(Jobportal jp, Model model) {
        model.addAttribute("message", "Thanks for Registering "+jp.getName()+"! You can now apply for jobs.");
        return "success";
    }
    

    
}