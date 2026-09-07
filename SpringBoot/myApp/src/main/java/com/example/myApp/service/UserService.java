package com.example.myApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.myApp.dto.UserDto;
import com.example.myApp.Models.User;
import com.example.myApp.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    public User save(UserDto userDto) {

        User user = new User(
                userDto.getEmail(),
                passwordEncoder.encode(userDto.getPassword()),
                userDto.getFullname()
        );

        return userRepository.save(user);
    }
}