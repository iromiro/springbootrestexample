package com.irem.springbootrestexample.repository;

import com.irem.springbootrestexample.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
