package com.example.productshop.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productshop.Model.Productshop;

public interface ProductshopRepository extends JpaRepository<Productshop, Integer> {
    
}
