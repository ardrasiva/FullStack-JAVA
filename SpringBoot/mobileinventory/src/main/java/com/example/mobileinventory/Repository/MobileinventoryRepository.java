package com.example.mobileinventory.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.mobileinventory.Model.Mobileinventory;

public interface MobileinventoryRepository extends JpaRepository<Mobileinventory, Integer>{

    @Query("SELECT mi.phoneName, mi.price FROM Mobileinventory mi")
    List<Object[]> getNameAndPrice();

    @Query("SELECT mi FROM Mobileinventory mi WHERE mi.price < 20000")
    List<Mobileinventory> getPhonesBelow20k();

    @Query("SELECT mi.type, COUNT(mi) FROM Mobileinventory mi GROUP BY mi.type")
    List<Object[]> getCountOfType();
    
}
