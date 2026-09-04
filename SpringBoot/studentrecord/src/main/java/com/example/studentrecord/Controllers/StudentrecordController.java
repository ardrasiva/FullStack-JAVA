package com.example.studentrecord.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.studentrecord.Model.Student;
import com.example.studentrecord.Repository.StudentRepository;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class StudentrecordController {

    @Autowired
    private StudentRepository sr;

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("message", "Enter the student details : ");
        return "create";
    }

    @PostMapping("/create")
    public String createProcess(Student s, Model model) {
        sr.save(s);
        model.addAttribute("message","The details of student "+s.getName()+"is added.");
        return "create";
    }
    

    @GetMapping("/all")
    public String getAllStudents(Model model, @Param("keyword") String keyword) {
        List<Student> students;
        if (keyword != null && !keyword.isEmpty()) {
            students =sr.findAllByKeyword(keyword);
        } else {
            students =sr.findAll();
        }
        model.addAttribute("students", students);
        return "list";
    }
    
     @GetMapping("/update/{id}")
    public String updateStudent(@PathVariable Integer id, Model model) {
        Optional<Student> optionalStudentDetails = sr.findById(id);
        if (optionalStudentDetails.isPresent()) {
            model.addAttribute("StudentDetails", optionalStudentDetails.get());
            return "update";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/update/{id}")
    public String updateProduct(@PathVariable Integer id, Student s) {
        Optional<Student> optionalStudentDetails = sr.findById(id);
        if (optionalStudentDetails.isPresent()) {
            Student sd = optionalStudentDetails.get();
            sd.setName(s.getName());
            sd.setClassname(s.getClassname());
            sd.setAge(s.getAge());

            sr.save(sd);
        }
        return "redirect:/all";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id, Model model) {
        Optional<Student> optionalStudentDetails = sr.findById(id);
        if (optionalStudentDetails.isPresent()) {
            model.addAttribute("StudentDetails", optionalStudentDetails.get());
            return "delete";
        }
        return "redirect:/all"; // Handle not found case
    }

    @PostMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        sr.deleteById(id);
        return "redirect:/all";
    }
    


    
    
}
