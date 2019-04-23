package com.digitallab.sigac.domain.model.entities;

import javax.persistence.*;

@Entity
public class PopulationVictimConflict {

    @Id
    private Long idPerson;
    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false)
    private String addresPerson;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(referencedColumnName = "id"),
            @JoinColumn(referencedColumnName = "department")})
    private Municipality municipality;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")
    private TypeVictimConflict typeVictimConflict;
}
