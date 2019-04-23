package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.domain.model.entities.base.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CaseFileDocument extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column
    private LocalDate caseFileDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(referencedColumnName = "id"),
            @JoinColumn(referencedColumnName = "department")})
    private Municipality municipality;

}
