package com.digitallab.sigac.repository.courses;

import com.digitallab.sigac.domain.model.entities.Courses;

import java.util.List;

public interface CoursesRepositoryFacade {

    Courses createCourse(Courses course);

    Courses updateCourse(Courses course);

    Courses removeCourse(Integer id);

    Courses findCourse(Integer course);

    List<Courses> findAllCourse();



}
