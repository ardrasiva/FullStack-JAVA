package com.example.loginlogout.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.loginlogout.Model.Loginlogout;
import com.example.loginlogout.Repository.LoginlogoutRepository;
import com.example.loginlogout.dto.LoginlogoutDto;

@Service
public class LoginlogoutService {

    @Autowired
    private PasswordEncoder pe;

    @Autowired
    private LoginlogoutRepository llr;

    public Loginlogout save(LoginlogoutDto lld) {

        Loginlogout ll = new Loginlogout();
        ll.setEmail(lld.getEmail());
        ll.setPassword(pe.encode(lld.getPassword()));
        ll.setFullName(lld.getFullName());
        ll.setLastName(lld.getLastName());
        ll.setAddress(lld.getAddress());

        return llr.save(ll);
    }
}