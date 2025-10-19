package com.student.portal.controller;

import com.student.portal.dto.TeacherCreateRequest;
import com.student.portal.dto.TeacherResponse;
import com.student.portal.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TeacherResponse> create(@Valid @RequestBody TeacherCreateRequest request,
                                                  UriComponentsBuilder uriBuilder) {
        var created = service.create(request);
        return ResponseEntity
                .created(uriBuilder.path("/api/teachers/{id}").buildAndExpand(created.id()).toUri())
                .body(created);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TeacherResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getById(id));
    }
}