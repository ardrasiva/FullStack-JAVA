package com.example.userregistration.Controller;

import com.example.userregistration.Model.Userregistration;
import com.example.userregistration.Repository.UserregistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UserAPIController {

    @Autowired
    private UserregistrationRepository ur;

    @Autowired
    private PasswordEncoder passwordEncoder;
    

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Userregistration user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        ur.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
}