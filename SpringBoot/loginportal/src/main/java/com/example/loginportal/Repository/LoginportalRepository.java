package com.example.loginportal.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loginportal.Model.Loginportal;

public interface  LoginportalRepository extends JpaRepository<Loginportal, Integer>{
    Loginportal findByUsername(String username);
    
}
