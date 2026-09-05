package com.example.librarymembership.Model;

public class Librarymembership {

    private String name;
    private String dob;
    private String address;
    private String email;
    private String password;

    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setDob(String d){
        this.dob = d;
    }
    public void setAddress(String a){
        this.address = a;
    }
    public void setEmail(String e){
        this.email = e;
    }
    public void setPassword(String p){
        this.password = p;
    }



    
}