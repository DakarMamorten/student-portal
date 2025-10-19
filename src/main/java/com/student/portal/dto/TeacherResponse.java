package com.student.portal.dto;

import java.time.LocalDate;

public record TeacherResponse(Long id,
                              String login,
                              String firstName,
                              String lastName,
                              String personalEmail,
                              LocalDate birthDate,

                              String degree,
                              LocalDate hireDate,
                              String title,
                              Double salary) {
}
