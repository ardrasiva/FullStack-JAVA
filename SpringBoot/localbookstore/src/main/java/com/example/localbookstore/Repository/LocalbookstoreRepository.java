package com.example.localbookstore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.localbookstore.Model.Localbookstore;

public interface LocalbookstoreRepository extends JpaRepository<Localbookstore, Integer>{

    @Query ("SELECT l FROM Localbookstore l WHERE l.title LIKE %:keyword%")
    List<Localbookstore> findAllByKeyword(@Param("keyword") String keyword);
    
}
