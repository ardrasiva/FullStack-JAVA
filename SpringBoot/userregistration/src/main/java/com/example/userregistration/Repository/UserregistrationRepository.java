package com.example.userregistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userregistration.Model.Userregistration;

public interface UserregistrationRepository extends JpaRepository<Userregistration, Integer>{
    
}
