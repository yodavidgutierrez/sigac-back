package com.digitallab.sigac.repository.student.impl;

import com.digitallab.sigac.commons.enums.IdentityType;
import com.digitallab.sigac.domain.model.entities.Student;
import com.digitallab.sigac.repository.student.StudentRepository;
import com.digitallab.sigac.repository.student.StudentRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolationException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class StudentRepositoryFacadeImpl implements StudentRepositoryFacade {

    private final StudentRepository repository;

    @Autowired
    public StudentRepositoryFacadeImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student createStudent(Student student) {
        try {
            return repository.save(student);
        } catch (ConstraintViolationException | DataIntegrityViolationException c) {
            return new Student();
        }
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student findStudentByDocumentIdAndIdType(Long documentNumber, Integer type) {
        Optional<IdentityType> identityTypeOptional = Arrays.stream(IdentityType.values())
                .filter(identityType -> identityType.getCode() == type)
                .findFirst();
        return repository.findByDocumentNumberAndIdType(documentNumber, identityTypeOptional.get());
    }
}
