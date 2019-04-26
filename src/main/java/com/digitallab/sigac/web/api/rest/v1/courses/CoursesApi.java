package com.digitallab.sigac.web.api.rest.v1.courses;

import com.digitallab.sigac.commons.model.generic.CoursesDTO;

import java.util.List;

public interface CoursesApi {


    CoursesDTO createCourse(CoursesDTO course);

    CoursesDTO updateCourse(CoursesDTO course);

    CoursesDTO removeCourse(Integer id);

    CoursesDTO findCourse(Integer course);

    List<CoursesDTO> findAllCourse();
}
