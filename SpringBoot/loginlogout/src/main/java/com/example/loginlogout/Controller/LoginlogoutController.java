package com.example.loginlogout.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.loginlogout.dto.LoginlogoutDto;
import com.example.loginlogout.Service.LoginlogoutService;

@Controller
public class LoginlogoutController {

    @Autowired
    private LoginlogoutService lls;

    @GetMapping("/registration")
    public String getRegistrationPage(
            @ModelAttribute("user") LoginlogoutDto lld) {

        return "register";
    }

    @PostMapping("/registration")
    public String saveUser(
            @ModelAttribute("user") LoginlogoutDto lld,
            Model model) {

        lls.save(lld);

        model.addAttribute(
                "message",
                "Registered Successfully!");

        return "register";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }
}