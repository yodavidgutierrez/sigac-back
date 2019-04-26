package com.digitallab.sigac.service.courses;

import com.digitallab.sigac.commons.model.generic.CoursesDTO;

import java.util.List;

public interface CoursesService {


    CoursesDTO createCourse(CoursesDTO course);

    CoursesDTO updateCourse(CoursesDTO course);

    CoursesDTO removeCourse(Integer id);

    CoursesDTO findCourse(Integer course);

    List<CoursesDTO> findAllCourse();
}
