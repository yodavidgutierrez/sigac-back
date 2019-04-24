package com.digitallab.sigac.service.student;

import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;

import java.util.List;

public interface StudentService {

    StudentDTOResponse createStudent(final StudentDTORequest student);

    List<StudentDTOResponse> findAllStudent();

    StudentDTOResponse findStudentByDocumentIdAndIdType(final Long documentNumber, final Integer type);

}
