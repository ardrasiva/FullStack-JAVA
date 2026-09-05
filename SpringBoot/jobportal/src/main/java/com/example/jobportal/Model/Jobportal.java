package com.example.jobportal.Model;


public class Jobportal {

    private String name;
    private String mobileNumber;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String n) {
        this.name = n;
    }
    

    public void setMobileNumber(String mn) {
        this.mobileNumber = mn;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setPassword(String p) {
        this.password = p;
    }
    
}
