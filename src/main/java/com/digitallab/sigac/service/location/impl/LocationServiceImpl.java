package com.digitallab.sigac.service.location.impl;

import com.digitallab.sigac.domain.model.entities.Department;
import com.digitallab.sigac.domain.model.entities.Municipality;
import com.digitallab.sigac.domain.model.entities.MunicipalityId;
import com.digitallab.sigac.repository.department.DepartmentRepositoryFacade;
import com.digitallab.sigac.repository.municipality.MunicipalityRepositoryFacade;
import com.digitallab.sigac.service.location.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private final MunicipalityRepositoryFacade municipalityRepo;

    private final DepartmentRepositoryFacade departmentRepo;

    @Autowired
    public LocationServiceImpl(MunicipalityRepositoryFacade municipalityRepo, DepartmentRepositoryFacade departmentRepo) {
        this.municipalityRepo = municipalityRepo;
        this.departmentRepo = departmentRepo;
    }


    @Override
    public List<Department> findAllDepartments() {
        return departmentRepo.findAllDepartment();
    }

    @Override
    public List<Municipality> findMunicipalitiesByIdDepartment(Integer idMunicipal, Integer idDepart) {
        return municipalityRepo.findMunicipalitiesByIdDepartment(
                new MunicipalityId(idMunicipal,new Department(idDepart)));
    }

}
