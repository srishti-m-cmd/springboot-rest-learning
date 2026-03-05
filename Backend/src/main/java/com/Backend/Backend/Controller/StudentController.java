package com.Backend.Backend.Controller;

import com.Backend.Backend.DTO.StudentDTO;
import com.Backend.Backend.Repository.StudentRepository;
import com.Backend.Backend.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }
    @GetMapping("/student/{id}")
    public StudentDTO getStudentById(){
        return new StudentDTO(18,"srishtiramesh","srishtirameshk@gmail.com");
    }
}
