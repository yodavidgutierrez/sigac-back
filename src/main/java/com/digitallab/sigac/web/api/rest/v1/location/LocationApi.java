package com.digitallab.sigac.web.api.rest.v1.location;

import com.digitallab.sigac.commons.model.generic.MunicipalityDTO;
import com.digitallab.sigac.domain.model.entities.Department;

import java.util.List;

public interface LocationApi {

    List<Department> findAllDepartments();

    List<MunicipalityDTO> findMunicipalitiesById_Department(Integer idMunicipal, Integer idDepart);

}
