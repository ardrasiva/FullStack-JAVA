package com.example.registeruser.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registeruser.Model.Registeruser;
import com.example.registeruser.Service.RegisteruserService;

@RestController
public class RegisteruserAPIController {

    @Autowired
    private RegisteruserService rs;

    @PostMapping("/api/register")
    public Map<String, String> registerUser(@RequestBody Registeruser user) {

        Registeruser savedUser = rs.registerUser(user);

        Map<String, String> response = new HashMap<>();

        response.put("username", savedUser.getFirstName() + " " + savedUser.getLastName());
        response.put("email", savedUser.getEmail());

        return response;
    }
}