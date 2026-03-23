package com.Backend.Backend.Service;

import com.Backend.Backend.DTO.AddStudentRequestDto;
import com.Backend.Backend.DTO.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getStudentById(Long id);

    StudentDto createNewStudent(AddStudentRequestDto addStudentRequestDto);

    void deleteStudentById(long id);

    StudentDto updateStudent(Long id, AddStudentRequestDto addStudentRequestDto);
}
