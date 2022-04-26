package com.irem.springbootrestexample.serice;

import com.irem.springbootrestexample.model.Student;
import com.irem.springbootrestexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public List<Student> findAllStudent(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).get();
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }


}
