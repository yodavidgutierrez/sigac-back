package com.digitallab.sigac.commons.model.generic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DepartmentDTO implements Serializable {

    private Integer id;
    private String name;

}
