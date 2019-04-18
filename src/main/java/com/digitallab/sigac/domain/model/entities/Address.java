package com.digitallab.sigac.domain.model.entities;

import javax.persistence.*;

public class Address{

    @Id
    private Long idPerson;
    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false)
    private String addresPerson;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private Municipality municipality;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")
    private Department department;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")
    private Zone zone;

}
