package com.digitallab.sigac.service.courses.impl;

import com.digitallab.sigac.commons.model.generic.CoursesDTO;
import com.digitallab.sigac.domain.model.entities.Courses;
import com.digitallab.sigac.repository.courses.CoursesRepositoryFacade;
import com.digitallab.sigac.service.courses.CoursesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CoursesServiceImpl implements CoursesService {

    private final CoursesRepositoryFacade repository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    public CoursesServiceImpl(CoursesRepositoryFacade repository) {
        this.repository = repository;
    }


    @Override
    public CoursesDTO createCourse(CoursesDTO course) {
        return mapper.map(repository.createCourse(mapper.map(course, Courses.class)), CoursesDTO.class);
    }

    @Override
    public CoursesDTO updateCourse(CoursesDTO course) {
        return mapper.map(repository.updateCourse(mapper.map(course, Courses.class)), CoursesDTO.class);
    }

    @Override
    public CoursesDTO removeCourse(Integer id) {
        return mapper.map(repository.removeCourse(id),CoursesDTO.class);
    }

    @Override
    public CoursesDTO findCourse(Integer course) {
        return mapper.map(repository.findCourse(course), CoursesDTO.class);
    }

    @Override
    public List<CoursesDTO> findAllCourse() {
        return repository.findAllCourse().stream()
                .map(courses -> mapper.map(courses, CoursesDTO.class))
                .collect(Collectors.toList());
    }
}
