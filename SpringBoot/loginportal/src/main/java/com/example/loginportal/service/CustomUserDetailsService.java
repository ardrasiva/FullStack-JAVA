package com.example.loginportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.loginportal.Model.Loginportal;
import com.example.loginportal.Repository.LoginportalRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private LoginportalRepository lpr;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Loginportal user = lpr.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new CustomUserDetail(user);
    }
}