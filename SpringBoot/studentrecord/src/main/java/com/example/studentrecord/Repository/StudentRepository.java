package com.example.studentrecord.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.studentrecord.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
    @Query("SELECT s FROM Student s WHERE s.name LIKE %:keyword%")
    List<Student> findAllByKeyword(@Param("keyword") String keyword);
}
