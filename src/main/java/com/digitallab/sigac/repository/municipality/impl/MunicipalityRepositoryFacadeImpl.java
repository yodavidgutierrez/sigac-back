package com.digitallab.sigac.repository.municipality.impl;

import com.digitallab.sigac.domain.model.entities.Municipality;
import com.digitallab.sigac.domain.model.entities.MunicipalityId;
import com.digitallab.sigac.repository.municipality.MunicipalityRepository;
import com.digitallab.sigac.repository.municipality.MunicipalityRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MunicipalityRepositoryFacadeImpl implements MunicipalityRepositoryFacade {

    private final MunicipalityRepository repository;

    @Autowired
    public MunicipalityRepositoryFacadeImpl(MunicipalityRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Municipality> findMunicipalitiesByIdDepartment(MunicipalityId id) {
        return repository.findMunicipalitiesById_Department(id);
    }
}
