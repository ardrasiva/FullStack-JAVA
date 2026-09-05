package com.example.bookshop.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bookshop.Model.Bookshop;

public interface  BookshopRepository extends JpaRepository<Bookshop, Integer> {
    

    
}
