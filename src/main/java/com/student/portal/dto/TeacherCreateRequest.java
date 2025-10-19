package com.student.portal.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record TeacherCreateRequest(@Schema(example = "teacher0001" ) @NotBlank String login,
                                   @Schema(example = "pass123") @NotBlank String password,
                                   @Schema(example = "Name") @NotBlank String firstName,
                                   @Schema(example = "Surname") @NotBlank String lastName,
                                   @Schema(example = "mail@example.com") @Email @NotBlank String personalEmail,
                                   @Schema(example = "2003-02-15") LocalDate birthDate,

                                   @Schema(example = "PhD" )@Size(max = 50) String degree,
                                   @Schema(example = "Professor" )@Size(max = 50) String title,
                                   @Schema(example = "2018-09-01" )LocalDate hireDate,
                                   @Schema(example = "7500.00")@PositiveOrZero Double salary) {

}
