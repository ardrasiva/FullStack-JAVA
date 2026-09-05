package com.example.mobileshop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mobileshop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private float price;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public float getPrice(){
        return price;
    }

    public void setId(int i){
        this.id = i;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setDescription(String d){
        this.description = d;
    }
    public void setPrice(float p){
        this.price = p;
    }

    
    
}
