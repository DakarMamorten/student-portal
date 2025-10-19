package com.student.portal.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(name = "StudentCreateRequest", description = "Данные для создания студента (включая базовые поля пользователя)")
public record StudentCreateRequest(@Schema(example = "student04" ) @NotBlank String login,
                                   @Schema(example = "pass123") @NotBlank String password,
                                   @Schema(example = "Maria") @NotBlank String firstName,
                                   @Schema(example = "Yurchenko") @NotBlank String lastName,
                                   @Schema(example = "maria@example.com") @Email @NotBlank String personalEmail,
                                   @Schema(example = "2003-02-15") LocalDate birthDate,

                                   @Schema(example = "AGR-2025-004") @NotBlank String agreementNumber,
                                   @Schema(example = "true") Boolean agreementSigned,
                                   @Schema(example = "2025-09-01") LocalDate enrollmentDate,
                                   @Schema(example = "2029-06-30") LocalDate graduationDate,
                                   @Schema(example = "true") boolean scholarship,
                                   @Schema(example = "4.75") @Digits(integer = 2, fraction = 2) BigDecimal avgScore,
                                   @Schema(example = "1") Integer modeOfStudy,
                                   @Schema(example = "1") Integer currentSemester,
                                   @Schema(example = "2025") Integer enrollmentYear,
                                   @Schema(example = "2") Integer specialization,
                                   @Schema(example = "WINTER") String enrollSemester,
                                   @Schema(example = "Informatyka") String faculty) {
}