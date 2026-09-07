package com.example.localbookstore.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Localbookstore {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String author;
    private String genre;
    private float price;
    private String publishedDate;

    public Integer getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getGenre(){
        return genre;
    }
    public float getPrice(){
        return price;
    }
    public String getPublishedDate(){
        return publishedDate;
    }

    public void setId(Integer i){
        this.id = i;
    }
    public void setTitle(String t){
        this.title = t;
    }
    public void setAuthor(String a){
        this.author = a;
    }
    public void setGenre(String g){
        this.genre = g;
    }
    public void setPrice(float p){
        this.price = p;
    }
    public void setPublishedDate(String p){
        this.publishedDate = p;
    }


    
}
