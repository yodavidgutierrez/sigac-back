package com.digitallab.sigac.domain.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Municipality {

    @EmbeddedId
    private MunicipalityId id;

    private String name;

    @JoinColumn(name = "`department`", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Department department;




}
