package com.student.portal.service;

import com.student.portal.domain.Teacher;
import com.student.portal.dto.TeacherCreateRequest;
import com.student.portal.dto.TeacherResponse;
import com.student.portal.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TeacherService {

    private final TeacherRepository repo;

    public TeacherService(TeacherRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public TeacherResponse create(TeacherCreateRequest req) {
        Teacher teacher = new Teacher();

        teacher.setLogin(req.login());
        teacher.setPassword(req.password());
        teacher.setFirstName(req.firstName());
        teacher.setLastName(req.lastName());
        teacher.setPersonalEmail(req.personalEmail());
        teacher.setBirthDate(req.birthDate());

        teacher.setDegree(req.degree());
        teacher.setHireDate(req.hireDate());
        teacher.setTitle(req.title());
        teacher.setSalary(req.salary());

        Teacher saved = repo.save(teacher);

        return new TeacherResponse(
                saved.getId(),
                saved.getLogin(),
                saved.getFirstName(),
                saved.getLastName(),
                saved.getPersonalEmail(),
                saved.getBirthDate(),

                saved.getDegree(),
                saved.getHireDate(),
                saved.getTitle(),
                saved.getSalary()
        );
    }

    @Transactional(readOnly = true)
    public TeacherResponse getById(Long id) {
        Teacher t = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found"));
        return new TeacherResponse(
                t.getId(),
                t.getLogin(),
                t.getFirstName(),
                t.getLastName(),
                t.getPersonalEmail(),
                t.getBirthDate(),

                t.getDegree(),
                t.getHireDate(),
                t.getTitle(),
                t.getSalary()
        );
    }
}