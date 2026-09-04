package com.example.registration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.registration.Model.Registration;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class RegistrationController {
    @GetMapping("/register")
    public String register(Model model) {

        Registration user = new Registration();
        model.addAttribute("user", user);
        return "register";
    }
    
    @PostMapping("/register")
    public String postMethodName(@Valid @ModelAttribute("user") Registration user, BindingResult result, Model model) {
        if(result.hasErrors())
        {
            return "register";
        }
        else
        {
            return "success";
        }
        
    }
    
}
