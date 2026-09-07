package com.example.userregistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.userregistration.Model.Userregistration;
import com.example.userregistration.Repository.UserregistrationRepository;

@Service
public class UserregistrationService {

    @Autowired
    private UserregistrationRepository ur;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(Userregistration user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        ur.save(user);
    }
}