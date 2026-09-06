package com.example.loginlogout.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "loginlogoutportal", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Loginlogout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String fullName;
    private String lastName;
    private String address;

    public Loginlogout() {

    }

    public Loginlogout(String e, String p, String f, String l, String a) {
        this.email = e;
        this.password = p;
        this.fullName = f;
        this.lastName = l;
        this.address = a;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public void setFullName(String f) {
        this.fullName = f;
    }

    public void setLastName(String l) {
        this.lastName = l;
    }

    public void setAddress(String a) {
        this.address = a;
    }
}