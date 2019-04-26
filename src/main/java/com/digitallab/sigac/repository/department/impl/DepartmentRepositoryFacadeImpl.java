package com.digitallab.sigac.repository.department.impl;

import com.digitallab.sigac.domain.model.entities.Department;
import com.digitallab.sigac.repository.department.DepartmentRepository;
import com.digitallab.sigac.repository.department.DepartmentRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class DepartmentRepositoryFacadeImpl implements DepartmentRepositoryFacade {

    private final DepartmentRepository repository;

    @Autowired
    public DepartmentRepositoryFacadeImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Department> findDepartment(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Department> findAllDepartment() {
        return repository.findAll();
    }
}
