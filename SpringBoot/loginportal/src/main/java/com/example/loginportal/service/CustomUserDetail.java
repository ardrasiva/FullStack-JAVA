package com.example.loginportal.service;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.loginportal.Model.Loginportal;

public class CustomUserDetail implements UserDetails {

    private Loginportal lp;

    public CustomUserDetail(Loginportal lp) {
        this.lp = lp;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    public String getPhoneNumber() {
        return lp.getPhoneNumber();
    }

    @Override
    public String getPassword() {
        return lp.getPassword();
    }

    @Override
    public String getUsername() {
        return lp.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}