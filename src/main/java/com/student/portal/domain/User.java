package com.student.portal.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "user")
@RequiredArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 24, nullable = false)
    private String password;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;

    @Column(length = 20, nullable = false, unique = true)
    private String login;

    @Column(name = "personal_email", length = 50, unique = true)
    private String personalEmail;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "created_on")
    private LocalDateTime createdOn;

    @Column(name = "last_updated_on")
    private LocalDateTime lastUpdatedOn;


}