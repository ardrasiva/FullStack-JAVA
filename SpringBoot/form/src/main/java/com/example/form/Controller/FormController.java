package com.example.form.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @GetMapping("/result")
    public String getMethodName(@RequestParam(required = false) String username, Model model) {
        model.addAttribute("username", username);
        return "result";
    }
    
    
    
}
