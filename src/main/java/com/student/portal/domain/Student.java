package com.student.portal.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "student")
@Getter
@Setter
public class Student extends User{

    @Column(name = "enrollment_year")
    private LocalDate enrollmentYear;

    @Column(name = "enrollment_semester")
    private LocalDate enrollmentSemester;

    @Column(name = "avg_score", precision = 4, scale = 2)
    private BigDecimal avgScore;

    @Column(name = "graduation_date")
    private LocalDate graduationDate;

    @Column(name = "scholarship", nullable = false)
    private boolean scholarship;

    @Column(name = "current_semester")
    private Integer currentSemester;

    @Enumerated(EnumType.STRING)
    @Column(name = "enroll_semester", length = 10)
    private Semester enrollSemester;

    @Column(name = "faculty", length = 100)
    private String faculty;
}
