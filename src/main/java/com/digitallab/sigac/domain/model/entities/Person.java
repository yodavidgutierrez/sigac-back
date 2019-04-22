package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.commons.enums.Genre;
import com.digitallab.sigac.commons.enums.IdentityType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@EqualsAndHashCode(of = {"idPerson"})
@Data
@NoArgsConstructor
@Inheritance(
        strategy = InheritanceType.JOINED
)
public class Person extends BaseEntity {

    @Id
    @GeneratedValue
    private Long idPerson;
    @Column(unique = true, nullable = false)
    private Long documentNumber;
    @Enumerated(EnumType.ORDINAL)
    private IdentityType idType;
    private String firstLastName;
    private String secondLastName;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private Integer stratum;
    private Integer sisben;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmunipio_id", referencedColumnName = "id")
    private Municipality municipality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private TypeDisability typeDisability;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private ExceptionalAbility exceptionalAbility;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private EthnicGroup ethnicGroup;


}
