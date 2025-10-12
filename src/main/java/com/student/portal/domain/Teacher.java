package com.student.portal.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "teacher")
@DiscriminatorValue("TEACHER")
@PrimaryKeyJoinColumn(name = "id")
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
