package com.Backend.Backend.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data

public class AddStudentRequestDto {
    @NotBlank(message="Name is Required")
    @Size(min=3,max=30,message="Name should be min3 characters")
    private String name;

    @Email
    @NotBlank(message = "Email is required")
    private String email;
}