package com.student.portal.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "teacher")
@Getter
@Setter
public class Teacher extends User{

    @Column(length = 50)
    private String degree;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "title", length = 50)
    private String title;
}
