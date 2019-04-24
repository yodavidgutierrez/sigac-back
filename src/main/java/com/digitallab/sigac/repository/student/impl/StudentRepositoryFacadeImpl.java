package com.digitallab.sigac.repository.student.impl;

import com.digitallab.sigac.domain.model.entities.Student;
import com.digitallab.sigac.repository.student.StudentRepository;
import com.digitallab.sigac.repository.student.StudentRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentRepositoryFacadeImpl implements StudentRepositoryFacade {

    private final StudentRepository repository;

    @Autowired
    public StudentRepositoryFacadeImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }
}
