package com.digitallab.sigac.domain.model.entities;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    private Long idPerson;
    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false, unique = true)
    private String phonePerson;
}
