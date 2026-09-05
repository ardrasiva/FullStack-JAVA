package com.example.mobileinventory.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Mobileinventory {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String phoneName;
    private String brand;
    private float price;
    private String type;

    public int getId() {
        return id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getBrand() {
        return brand;
    }

    public float getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneName(String n) {
        this.phoneName = n;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public void setPrice(float p) {
        this.price = p;
    }

    public void setType(String t) {
        this.type = t;
    }
}
    

