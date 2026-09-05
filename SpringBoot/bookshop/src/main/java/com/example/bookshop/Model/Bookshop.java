package com.example.bookshop.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bookshop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private float price;

    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public float getPrice(){
        return price;
    }

    public void setId(int i)
    {
        this.id = i;
    }
    public void setTitle(String t)
    {
        this.title = t;
    }
    public void setAuthor(String a)
    {
        this.author = a;
    }
    public void setPrice(float p)
    {
        this.price = p;
    }
    
    
}
