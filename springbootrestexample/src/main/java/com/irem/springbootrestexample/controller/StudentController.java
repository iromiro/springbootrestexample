package com.irem.springbootrestexample.controller;

import com.irem.springbootrestexample.model.Student;
import com.irem.springbootrestexample.serice.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){
        Student addStudent = studentService.addStudent(student);
        return new ResponseEntity<Student>(addStudent, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent(){
        List<Student> allStudent = studentService.findAllStudent();
        return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentId(@PathVariable("id") Long id){

        Student studentById = studentService.getStudentById(id);
        return new ResponseEntity<Student>(studentById, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable("id") Long id){
        studentService.deleteStudentById(id);
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
