package com.digitallab.sigac.web.api.rest.v1.student.impl;

import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;
import com.digitallab.sigac.service.student.StudentService;
import com.digitallab.sigac.web.api.rest.v1.student.StudentApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student/v1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", methods = RequestMethod.POST)
public class StundentApiImpl implements StudentApi {

    private final StudentService studentService;

    @Autowired
    public StundentApiImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<StudentDTOResponse> createStudent(@RequestBody StudentDTORequest student) {
        return ResponseEntity.ok().body(studentService.createStudent(student));
    }
}
