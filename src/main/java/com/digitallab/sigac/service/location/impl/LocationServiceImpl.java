package com.digitallab.sigac.service.location.impl;

import com.digitallab.sigac.commons.model.generic.MunicipalityDTO;
import com.digitallab.sigac.domain.model.entities.Department;
import com.digitallab.sigac.domain.model.entities.MunicipalityId;
import com.digitallab.sigac.repository.department.DepartmentRepositoryFacade;
import com.digitallab.sigac.repository.municipality.MunicipalityRepositoryFacade;
import com.digitallab.sigac.service.location.LocationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl implements LocationService {

    private final MunicipalityRepositoryFacade municipalityRepo;

    private final DepartmentRepositoryFacade departmentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public LocationServiceImpl(final MunicipalityRepositoryFacade municipalityRepo, final DepartmentRepositoryFacade departmentRepo) {
        this.municipalityRepo = municipalityRepo;
        this.departmentRepo = departmentRepo;
    }

    @Override
    public List<Department> findAllDepartments() {
        return departmentRepo.findAllDepartment();
    }

    @Override
    public List<MunicipalityDTO> findMunicipalitiesByIdDepartment(final Integer idMunicipal, final Integer idDepart) {
        return municipalityRepo.findMunicipalitiesByIdDepartment(new MunicipalityId(idMunicipal,new Department(idDepart)))
                .stream().map(municipality -> modelMapper.map(municipality, MunicipalityDTO.class))
                .collect(Collectors.toList());
    }

}
