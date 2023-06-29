package com.example.validation.of.user.management.system.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
public class User {

    @NonNull
    private Integer userId;

    @NotBlank(message = "name cannot be black")
    private String userName;

    @Email(message = "Given email id is invalid")
    private String userEmail;

    @Pattern(regexp = "^(?=.*[!@#$%^&*()\\[\\]{};':\"\\\\|,.<>/?])(?=.*\\d)(?=.*[A-Z]).{6,}$")
    private String password;

    @Size(min = 7,max = 10)
    @Pattern(regexp = "^[0-9]+$")
    private String userContact;

    @Min(value = 18)
    @Max(value = 30)
    private Integer userAge;

    @NonNull
    private LocalDate userDOB; // ex = 2007-12-03.

    private Type userType;

}
