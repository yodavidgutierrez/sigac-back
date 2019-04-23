package com.digitallab.sigac.domain.model.entities;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class MunicipalityId implements Serializable {

    private Integer id;
    private Department department;

}
