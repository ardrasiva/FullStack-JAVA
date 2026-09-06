package com.example.loginlogout.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.loginlogout.Model.Loginlogout;
import com.example.loginlogout.Repository.LoginlogoutRepository;

@Service
public class LoginlogoutUserDetailsService implements UserDetailsService {

    @Autowired
    private LoginlogoutRepository llr;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        Loginlogout ll = llr.findByEmail(username);

        if (ll == null) {
            throw new UsernameNotFoundException("User not found");
        }

        return new LoginlogoutUserDetail(ll);
    }
}