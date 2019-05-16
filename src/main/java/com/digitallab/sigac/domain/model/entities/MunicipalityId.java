package com.digitallab.sigac.domain.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
public class MunicipalityId implements Serializable {

    public MunicipalityId() {
    }


    private Integer id;
    @JoinColumn(name = "`department`", referencedColumnName = "`id`")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Department department;

}
