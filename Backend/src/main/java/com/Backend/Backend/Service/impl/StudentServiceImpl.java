package com.Backend.Backend.Service.impl;

import com.Backend.Backend.DTO.StudentDTO;
import com.Backend.Backend.Repository.StudentRepository;
import com.Backend.Backend.Service.StudentService;
import com.Backend.Backend.entity.Student;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students
                .stream()
                .map(student ->
            new StudentDTO(student.getId(), student.getName(),
                    student.getEmail()))
                .toList();

    }

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student= studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("student not found with ID: "+id));
        return modelMapper.map(student, StudentDTO.class);
    }


}

