package com.example.localshop.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.localshop.model.Localshop;

public interface LocalshopRepository extends JpaRepository<Localshop, Integer>{

    @Query("SELECT l from Localshop l WHERE l.name LIKE %:keyword% OR l.description LIKE %:keyword% OR l.category LIKE %:keyword%")
    List<Localshop> findAllByKeyword(@Param("keyword") String keyword);
    
}
