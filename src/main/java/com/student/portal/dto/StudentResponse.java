package com.student.portal.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

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
