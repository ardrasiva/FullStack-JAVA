package com.example.registration.Model;

import com.example.registration.Address;
import com.example.registration.Gmail;

import jakarta.validation.constraints.NotBlank;

public class Registration {
    
    @NotBlank(message = "Name is required")
    private String name;

    @Gmail
    private String email;

    @Address
    private String address;


    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }

    public void setName(String n)
    {
        this.name=n;
    }
    public void setEmail(String e)
    {
        this.email=e;
    }
    public void setAddress(String a)
    {
        this.address=a;
    }

}
