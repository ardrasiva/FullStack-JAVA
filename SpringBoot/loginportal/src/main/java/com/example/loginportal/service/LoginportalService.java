package com.example.loginportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.loginportal.Model.Loginportal;
import com.example.loginportal.Repository.LoginportalRepository;
import com.example.loginportal.dto.LoginportalDto;

@Service 
public class LoginportalService {

    @Autowired 
    private PasswordEncoder pe;

    @Autowired 
    private LoginportalRepository lpr;

    public Loginportal save(LoginportalDto lpd){
        Loginportal lp = new Loginportal(lpd.getPhoneNumber(), lpd.getUsername(), pe.encode(lpd.getPassword()));
        return lpr.save(lp);
    }

   

}
