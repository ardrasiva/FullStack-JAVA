    package com.example.librarymembership.Controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;

    import com.example.librarymembership.Model.Librarymembership;

    import org.springframework.web.bind.annotation.PostMapping;



    @Controller 
    public class LibrarymembershipController {

        @GetMapping("/register")
        public String register() {
            return "register";
        }

        @PostMapping("/register")
        public String registerSuccess(Librarymembership lm, Model model) {
            model.addAttribute("message", "Welcome, "  +lm.getName()+"! Your library membership has been created.");
            return "success";
        }
        
        
        
    }
