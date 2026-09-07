package com.example.userregistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.userregistration.Model.Userregistration;
import com.example.userregistration.Service.UserregistrationService;

@Controller
public class UserController {

    @Autowired
    private UserregistrationService us;

    @GetMapping("/registration")
    public String registration(Model model) {

        model.addAttribute("user", new Userregistration());

        return "register";
    }

    @PostMapping("/registration")
    public String registerUser(Userregistration user, Model model) {

        us.registerUser(user);

        model.addAttribute("message", "Registration Successful!");

        return "register";
    }
}