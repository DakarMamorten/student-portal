package com.student.portal.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDate;

public record StudentCreateRequest (@NotBlank String login,
                                    @NotBlank String password,
                                    @NotBlank String firstName,
                                    @NotBlank String lastName,
                                    @Email @NotBlank String personalEmail,
                                    LocalDate birthDate,
                                    @NotBlank String agreementNumber,
                                    Boolean agreementSigned,
                                    LocalDate enrollmentDate,
                                    LocalDate graduationDate,
                                    boolean scholarship,
                                    @Digits(integer = 2, fraction = 2) BigDecimal avgScore,
                                    Integer modeOfStudy,
                                    Integer currentSemester,
                                    Integer enrollmentYear,
                                    Integer specialization,
                                    String enrollSemester,
                                    String faculty
) {}