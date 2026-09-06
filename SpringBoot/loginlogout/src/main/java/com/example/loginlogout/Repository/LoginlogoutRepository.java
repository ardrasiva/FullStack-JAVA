package com.example.loginlogout.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loginlogout.Model.Loginlogout;

public interface LoginlogoutRepository extends JpaRepository<Loginlogout, Integer> {

    Loginlogout findByEmail(String email);

}