package com.digitallab.sigac.web.api.rest.v1.courses.impl;

import com.digitallab.sigac.commons.model.generic.CoursesDTO;
import com.digitallab.sigac.service.courses.CoursesService;
import com.digitallab.sigac.web.api.rest.v1.courses.CoursesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/v1/")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
public class CoursesApiImpl implements CoursesApi {

    private final CoursesService service;

    @Autowired
    public CoursesApiImpl(CoursesService service) {
        this.service = service;
    }

    @PostMapping("/")
    @Override
    public CoursesDTO createCourse(@RequestBody CoursesDTO course) {
        return service.createCourse(course);
    }

    @PutMapping("/")
    @Override
    public CoursesDTO updateCourse(@RequestBody CoursesDTO course) {
        return service.updateCourse(course);
    }

    @DeleteMapping("/{id}")
    @Override
    public CoursesDTO removeCourse(@PathVariable("id") Integer id) {
        return service.removeCourse(id);
    }

    @GetMapping("/{id}")
    @Override
    public CoursesDTO findCourse(@PathVariable("id") Integer course) {
        return service.findCourse(course);
    }

    @GetMapping("/")
    @Override
    public List<CoursesDTO> findAllCourse() {
        return service.findAllCourse();
    }
}
