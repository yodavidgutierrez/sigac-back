package com.digitallab.sigac.domain.model.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CaseFileDocument {
    @Id
    private Long idPerson;
    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column
    private LocalDate caseFileDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private Municipality municipality;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn( referencedColumnName = "id")
    private Department department;
}
