package com.digitallab.sigac.repository.department;

import com.digitallab.sigac.domain.model.entities.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepositoryFacade {

    Optional<Department> findDepartment(final Integer id);

    List<Department> findAllDepartment();

}
