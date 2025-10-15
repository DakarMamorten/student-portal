package com.student.portal.controller;

import com.student.portal.dto.StudentCreateRequest;
import com.student.portal.dto.StudentResponse;
import com.student.portal.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<StudentResponse> create(@Valid @RequestBody StudentCreateRequest request,
                                                  UriComponentsBuilder uriBuilder) {
        StudentResponse created = service.create(request);
        return ResponseEntity
                .created(uriBuilder.path("/api/students/{id}").buildAndExpand(created.id()).toUri())
                .body(created);
    }

    @GetMapping("/{id}")
    public StudentResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }
}
