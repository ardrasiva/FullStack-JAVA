package com.example.student.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.student.Model.Student;

    @Controller
    public class StudentController {
        @GetMapping("/student-info")
        public String studentInfo(Model model) {
            Student s = new Student(101,"Anjali Sharma",92.5f);
            model.addAttribute("studentinfo", s);
            return "student-info";
        }

        @GetMapping("/student-list")
        public String studentlist(Model model) {
            Student s1 = new Student(101,"Anjali Sharma",92.5f);
            Student s2 = new Student(102,"Rohit Mehta",85.0f);
            Student s3 = new Student(103,"Sneha Iyer",78.6f);
            List<Student> studentlist = new ArrayList<>();
            studentlist.add(s1);
            studentlist.add(s2);
            studentlist.add(s3);
            model.addAttribute("studentlist", studentlist);
            return "student-list";
        }
    }
