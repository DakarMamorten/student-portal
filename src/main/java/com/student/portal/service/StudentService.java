package com.student.portal.service;

import com.student.portal.domain.Semester;
import com.student.portal.domain.Student;
import com.student.portal.dto.StudentCreateRequest;
import com.student.portal.dto.StudentResponse;
import com.student.portal.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    @Transactional
    public StudentResponse create(StudentCreateRequest req) {
        Student s = new Student();

        s.setLogin(req.login().trim());
        s.setPassword(req.password());
        s.setFirstName(req.firstName().trim());
        s.setLastName(req.lastName().trim());
        s.setPersonalEmail(req.personalEmail().trim().toLowerCase());
        s.setBirthDate(req.birthDate());

        s.setAgreementNumber(req.agreementNumber());
        s.setAgreementSigned(req.agreementSigned());
        s.setEnrollmentDate(req.enrollmentDate());
        s.setGraduationDate(req.graduationDate());
        s.setScholarship(req.scholarship());
        s.setAvgScore(req.avgScore());
        s.setModeOfStudy(req.modeOfStudy());
        s.setCurrentSemester(req.currentSemester());
        s.setEnrollmentYear(req.enrollmentYear());
        s.setSpecialization(req.specialization());
        if (req.enrollSemester() != null) {
            s.setEnrollSemester(Semester.valueOf(req.enrollSemester().toUpperCase()));
        }
        s.setFaculty(req.faculty());

        var saved = repo.save(s);

        return new StudentResponse(
                saved.getId(),
                saved.getAgreementNumber(),
                saved.getAgreementSigned(),
                saved.getEnrollmentDate(),
                saved.getGraduationDate(),
                saved.isScholarship(),
                saved.getAvgScore(),
                saved.getModeOfStudy(),
                saved.getCurrentSemester(),
                saved.getEnrollmentYear(),
                saved.getSpecialization(),
                saved.getEnrollSemester() != null ? saved.getEnrollSemester().name() : null,
                saved.getFaculty()
        );
    }

    @Transactional(readOnly = true)
    public StudentResponse getById(Long id) {
        Student s = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Student not found: " + id));
        return new StudentResponse(
                s.getId(),
                s.getAgreementNumber(),
                s.getAgreementSigned(),
                s.getEnrollmentDate(),
                s.getGraduationDate(),
                s.isScholarship(),
                s.getAvgScore(),
                s.getModeOfStudy(),
                s.getCurrentSemester(),
                s.getEnrollmentYear(),
                s.getSpecialization(),
                s.getEnrollSemester() != null ? s.getEnrollSemester().name() : null,
                s.getFaculty()
        );
    }
}