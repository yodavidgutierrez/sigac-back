package com.digitallab.sigac.repository.municipality;

import com.digitallab.sigac.domain.model.entities.Municipality;
import com.digitallab.sigac.domain.model.entities.MunicipalityId;

import java.util.List;

public interface MunicipalityRepositoryFacade {

    List<Municipality> findMunicipalitiesByIdDepartment(MunicipalityId id);

}
