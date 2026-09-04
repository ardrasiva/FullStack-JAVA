package com.example.studentrecord.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String className;
    private Integer age;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getClassname(){
        return className;
    }
    public int getAge(){
        return age;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setClassname(String c){
        this.className=c;
    }
    public void setAge(int a){
        this.age=a;
    }

}
