package com.example.loginportal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.loginportal.dto.LoginportalDto;
import com.example.loginportal.service.LoginportalService;

@Controller
public class LoginportalController {

    @Autowired
    private LoginportalService lps;

    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") LoginportalDto lpd) {
        return "register";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("user") LoginportalDto lpd, Model model) {
        lps.save(lpd);
        model.addAttribute("message", "Registration Successful!");
        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
}