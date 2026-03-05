package com.Backend.Backend.Service.impl;

import com.Backend.Backend.DTO.StudentDTO;
import com.Backend.Backend.Repository.StudentRepository;
import com.Backend.Backend.Service.StudentService;
import com.Backend.Backend.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO>  studentDTOList = students
                .stream()
                .map(student -> {
            return new StudentDTO(student.getId(), student.getName(),
                    student.getEmail());})
                .toList();
        return studentDTOList;
    }
}

