package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.commons.enums.Genre;
import com.digitallab.sigac.commons.enums.IdentityType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@EqualsAndHashCode(of = {"idPerson"} , callSuper = false)
@Data
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private Genre genre;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idmunipio_id", referencedColumnName = "id")
    private Municipality municipality;

}
