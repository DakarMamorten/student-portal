package com.student.portal.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_on", updatable = false)
    private LocalDateTime createdOdt;

    @Column(name = "last_update_on")
    private LocalDateTime lastUpdateOn;

    @PrePersist
    public void prePersist() {
        this.createdOdt = LocalDateTime.now();
        this.lastUpdateOn = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.lastUpdateOn = LocalDateTime.now();
    }
}
