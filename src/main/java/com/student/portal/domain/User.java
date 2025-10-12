package com.student.portal.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "user_type", discriminatorType = DiscriminatorType.STRING)
@Getter
@Setter
public class User extends BaseEntity{

    @Column(length = 20, nullable = false, unique = true)
    private String login;

    @Column(length = 24, nullable = false)
    private String password;

    @Column(name = "first_name", length = 30, nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 30, nullable = false)
    private String lastName;

    @Column(name = "personal_email", length = 50, unique = true)
    private String personalEmail;

    @Column(name = "birth_date")
    private LocalDate birthDate;

}