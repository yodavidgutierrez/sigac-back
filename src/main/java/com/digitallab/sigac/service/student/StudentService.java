package com.digitallab.sigac.service.student;

import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;

public interface StudentService {

    StudentDTOResponse createStudent(final StudentDTORequest student);

}
