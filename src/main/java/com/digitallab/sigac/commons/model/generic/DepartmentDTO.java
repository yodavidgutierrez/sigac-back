package com.digitallab.sigac.commons.model.generic;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class DepartmentDTO implements Serializable {

    private Integer id;
    private String name;

    public DepartmentDTO(Integer id) {
        this.id = id;
    }

    public DepartmentDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO() {
    }
}
