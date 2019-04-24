package com.digitallab.sigac.repository.student;

import com.digitallab.sigac.domain.model.entities.Student;

import java.util.List;

public interface StudentRepositoryFacade {

    Student createStudent (final Student student);

    List<Student> findAllStudent();

    Student findStudentByDocumentIdAndIdType(final Long documentNumber, final Integer type);

}
