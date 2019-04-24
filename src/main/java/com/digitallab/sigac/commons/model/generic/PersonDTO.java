package com.digitallab.sigac.commons.model.generic;

import com.digitallab.sigac.commons.enums.Genre;
import com.digitallab.sigac.commons.enums.IdentityType;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;

@EqualsAndHashCode(of = {"idPerson"}, callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDTO implements Serializable {

    private Long documentNumber;
    private IdentityType idType;
    private String firstLastName;
    private String secondLastName;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private Integer stratum;
    private Genre genre;
    private MunicipalityDTO municipality;
    private Integer sisben;
    private String email;
    private DisabilityTypeDTO disabilityType;
    private ExceptionalAbilityDTO exceptionalAbility;
    private EthnicGroupDTO ethnicGroup;

}
