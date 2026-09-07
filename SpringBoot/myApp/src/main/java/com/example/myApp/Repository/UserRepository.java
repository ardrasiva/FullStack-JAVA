package com.example.myApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myApp.Models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByToken(String token);
    boolean existsByToken(String token);
}