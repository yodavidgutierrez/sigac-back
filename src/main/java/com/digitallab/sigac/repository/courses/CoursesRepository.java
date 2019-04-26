package com.digitallab.sigac.repository.courses;

import com.digitallab.sigac.domain.model.entities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, Integer> {

    Courses findByCourses(Integer course);

}
