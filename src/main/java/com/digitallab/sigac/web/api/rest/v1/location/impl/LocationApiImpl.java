package com.digitallab.sigac.web.api.rest.v1.location.impl;

import com.digitallab.sigac.commons.model.generic.MunicipalityDTO;
import com.digitallab.sigac.domain.model.entities.Department;
import com.digitallab.sigac.domain.model.entities.Municipality;
import com.digitallab.sigac.service.location.LocationService;
import com.digitallab.sigac.web.api.rest.v1.location.LocationApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/location/v1")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
public class LocationApiImpl implements LocationApi {

    private final LocationService locationService;

    @Autowired
    public LocationApiImpl(LocationService locationService) {
        this.locationService = locationService;
    }


    @GetMapping("/departments/")
    @Override
    public List<Department> findAllDepartments() {
        return locationService.findAllDepartments();
    }

    @GetMapping("/departments/{depto}/municipality/{municipal}")
    @Override
    public List<MunicipalityDTO> findMunicipalitiesById_Department(@PathVariable("municipal") Integer idMunicipal, @PathVariable("depto") Integer idDepart) {
        return locationService.findMunicipalitiesByIdDepartment(idMunicipal,idDepart);
    }
}
