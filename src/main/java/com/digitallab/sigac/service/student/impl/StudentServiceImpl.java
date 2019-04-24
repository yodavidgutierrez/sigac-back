package com.digitallab.sigac.service.student.impl;

import com.digitallab.sigac.commons.enums.StudentState;
import com.digitallab.sigac.commons.model.generic.StudentDTO;
import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;
import com.digitallab.sigac.domain.model.entities.Student;
import com.digitallab.sigac.repository.student.StudentRepositoryFacade;
import com.digitallab.sigac.service.student.StudentService;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Log4j2
public class StudentServiceImpl implements StudentService {

    private final StudentRepositoryFacade studentRepository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    public StudentServiceImpl(StudentRepositoryFacade studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public StudentDTOResponse createStudent(StudentDTORequest student) {
        log.info("StudentServiceImpl - Creating Student: {}", student.toString());
        Student studentCreated = studentRepository.createStudent(mapper.map(student, Student.class));

        return student != null ? StudentDTOResponse.builder()
                .id(studentCreated.getId())
                .state(StudentState.ACTIVO)
                .student(mapper.map(studentCreated, StudentDTO.class))
                .build() : new StudentDTOResponse();
    }

    @Override
    public List<StudentDTOResponse> findAllStudent() {
        log.info("StudentServiceImpl - finding all Students...");
        return studentRepository.findAllStudent()
                .stream().map(student -> mapper.map(student, StudentDTOResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTOResponse findStudentByDocumentIdAndIdType(Long documentNumber, Integer type) {
        log.info("StudentServiceImpl - finding student by document number {} and id type {}", documentNumber, type);
        Optional<Student> student = Optional.of(studentRepository.findStudentByDocumentIdAndIdType(documentNumber, type));
        return student.isPresent() ? mapper.map(student.get(), StudentDTOResponse.class) : null;
    }
}
