package com.digitallab.sigac.web.api.rest.v1.location;

import com.digitallab.sigac.domain.model.entities.Department;
import com.digitallab.sigac.domain.model.entities.Municipality;

import java.util.List;

public interface LocationApi {

    List<Department> findAllDepartments();

    List<Municipality> findMunicipalitiesById_Department(Integer idMunicipal, Integer idDepart);

}
