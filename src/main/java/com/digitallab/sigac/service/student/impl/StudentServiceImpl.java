package com.digitallab.sigac.service.student.impl;

import com.digitallab.sigac.commons.enums.StudentState;
import com.digitallab.sigac.commons.model.generic.StudentDTO;
import com.digitallab.sigac.commons.model.request.StudentDTORequest;
import com.digitallab.sigac.commons.model.response.StudentDTOResponse;
import com.digitallab.sigac.domain.model.entities.Student;
import com.digitallab.sigac.repository.student.StudentRepositoryFacade;
import com.digitallab.sigac.service.student.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
        Student studentCreated = studentRepository.createStudent(mapper.map(student, Student.class));

        return student != null ? StudentDTOResponse.builder()
                .id(studentCreated.getId())
                .state(StudentState.ACTIVO)
                .student(mapper.map(studentCreated, StudentDTO.class))
                .build() : new StudentDTOResponse();
    }
}
