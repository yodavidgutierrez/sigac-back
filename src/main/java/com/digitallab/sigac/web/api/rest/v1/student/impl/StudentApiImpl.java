package com.digitallab.sigac.web.api.rest.v1.student.impl;

import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;
import com.digitallab.sigac.service.student.StudentService;
import com.digitallab.sigac.web.api.rest.v1.student.StudentApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/student/v1", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
public class StudentApiImpl implements StudentApi {

    private final StudentService studentService;

    @Autowired
    public StudentApiImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<StudentDTOResponse> createStudent(@RequestBody StudentDTORequest student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createStudent(student));
    }

    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<StudentDTOResponse>> findAllStudent() {
        List<StudentDTOResponse> students = studentService.findAllStudent();
        return ResponseEntity.status(students != null ? HttpStatus.OK : HttpStatus.NO_CONTENT)
                .body(students != null ? students : new ArrayList<>());
    }

    @GetMapping(value = "/document-id/{id}/type/{type}")
    @Override
    public ResponseEntity<StudentDTOResponse> findStudentByDocumentIdAndIdType(@PathVariable("id") Long documentNumber,
                                                                               @PathVariable("type") Integer type) {
        StudentDTOResponse student = studentService.findStudentByDocumentIdAndIdType(documentNumber, type);
        return ResponseEntity.status(student != null ? HttpStatus.OK : HttpStatus.NO_CONTENT)
                .body(student != null ? student : new StudentDTOResponse());
    }
}
