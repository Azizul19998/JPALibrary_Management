package com.example.spring.JPALibraryManagement.Repository;

import com.example.spring.JPALibraryManagement.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
