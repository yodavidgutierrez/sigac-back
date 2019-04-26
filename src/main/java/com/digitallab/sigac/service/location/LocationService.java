package com.digitallab.sigac.service.location;

import com.digitallab.sigac.domain.model.entities.Department;
import com.digitallab.sigac.domain.model.entities.Municipality;

import java.util.List;

public interface LocationService {

    List<Department> findAllDepartments();

    List<Municipality> findMunicipalitiesByIdDepartment(Integer idMunicipal, Integer idDepart);

}
