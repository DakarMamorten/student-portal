package com.student.portal.dto;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.time.LocalDate;

@Schema(name = "StudentDetailsResponse")
public record StudentResponse(Long id,
                              String agreementNumber,
                              Boolean agreementSigned,
                              LocalDate enrollmentDate,
                              LocalDate graduationDate,
                              boolean scholarship,
                              BigDecimal avgScore,
                              Integer modeOfStudy,
                              Integer currentSemester,
                              Integer enrollmentYear,
                              Integer specialization,
                              String enrollSemester,
                              String faculty) {
}
