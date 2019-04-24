package com.digitallab.sigac.web.api.rest.v1.student;

import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentApi {

    ResponseEntity<StudentDTOResponse> createStudent (final StudentDTORequest student);

    ResponseEntity<List<StudentDTOResponse>> findAllStudent();

    ResponseEntity<StudentDTOResponse> findStudentByDocumentIdAndIdType(final Long documentNumber, final Integer type);

}
