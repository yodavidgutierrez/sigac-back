package com.digitallab.sigac.domain.model.entities;

import javax.persistence.*;
@Entity
public class Address{

    @Id
    private Long idPerson;
    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false)
    private String addresPerson;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private Municipality municipality;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")
    private Department department;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")
    private Zone zone;

}
