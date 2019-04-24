package com.digitallab.sigac.web.api.rest.v1.student;

import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;
import org.springframework.http.ResponseEntity;

public interface StudentApi {

    ResponseEntity<StudentDTOResponse> createStudent (final StudentDTORequest student);

}
