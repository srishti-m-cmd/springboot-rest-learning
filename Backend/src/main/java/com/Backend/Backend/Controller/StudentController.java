package com.Backend.Backend.Controller;

import com.Backend.Backend.DTO.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @GetMapping("/student")
    public StudentDTO getStudent(){
        return new StudentDTO(41,"srishti","srishtirameshk@gmail.com");
    }
    @GetMapping("/student/{id}")
    public StudentDTO getStudentById(){
        return new StudentDTO(18,"srishtiramesh","srishtirameshk@gmail.com");
    }
}
