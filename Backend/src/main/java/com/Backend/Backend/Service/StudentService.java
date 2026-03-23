package com.Backend.Backend.Service;

import com.Backend.Backend.DTO.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAllStudents();

    StudentDTO getStudentById(Long id);
}
