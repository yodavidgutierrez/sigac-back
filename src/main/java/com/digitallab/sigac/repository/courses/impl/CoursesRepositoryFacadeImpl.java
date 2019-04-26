package com.digitallab.sigac.repository.courses.impl;

import com.digitallab.sigac.domain.model.entities.Courses;
import com.digitallab.sigac.repository.courses.CoursesRepository;
import com.digitallab.sigac.repository.courses.CoursesRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CoursesRepositoryFacadeImpl implements CoursesRepositoryFacade {

    private final CoursesRepository repository;

    @Autowired
    public CoursesRepositoryFacadeImpl(CoursesRepository repository) {
        this.repository = repository;
    }

    @Override
    public Courses createCourse(Courses course) {
        return repository.save(course);
    }

    @Override
    public Courses updateCourse(Courses course) {
        Courses courseFinded = findCourse(course.getCourses());
        courseFinded.setCourses(course.getCourses());
        return repository.save(courseFinded);
    }

    @Override
    public Courses removeCourse(Integer id) {
        Courses course = findCourse(id);
        repository.delete(course);
        return course;
    }

    @Override
    public Courses findCourse(Integer course) {
        return repository.findByCourses(course);
    }

    @Override
    public List<Courses> findAllCourse() {
        return null;
    }
}
