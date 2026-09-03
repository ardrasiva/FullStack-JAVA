package com.example.student.Model;
public class Student {
    private int Rollnum;
    private String name;
    private float marks;
    public Student(int Rollnum, String name, float marks)
    {
        this.Rollnum= Rollnum;
        this.name = name;
        this.marks = marks;
    }

    public int getRollnum(){
        return Rollnum;
    }
    public String getName(){
        return name;
    }
    public float getMarks(){
        return marks;
    }

    public void setRollNum(int r){
        this.Rollnum = r;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setMarks(float m){
        this.marks = m;
    }

    
}
