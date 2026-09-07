package com.example.registeruser.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registeruser.Model.Registeruser;

public interface RegisteruserRepository extends JpaRepository<Registeruser, Integer> {

}