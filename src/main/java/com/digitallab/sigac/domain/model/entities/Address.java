package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.domain.model.entities.base.BaseEntity;

import javax.persistence.*;
@Entity
public class Address extends BaseEntity {

    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false)
    private String addresPerson;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(referencedColumnName = "id"),
            @JoinColumn(referencedColumnName = "department")})
    private Municipality municipality;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn( referencedColumnName = "id")
    private Zone zone;

}
