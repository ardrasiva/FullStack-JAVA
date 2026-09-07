package com.example.registeruser.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.registeruser.Model.Registeruser;
import com.example.registeruser.Repository.RegisteruserRepository;

@Service
public class RegisteruserService {

    @Autowired
    private RegisteruserRepository rr;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Registeruser registerUser(Registeruser user) {

        String encodedPassword = passwordEncoder.encode(user.getPassword());

        user.setPassword(encodedPassword);

        return rr.save(user);
    }
}