package com.digitallab.sigac.commons.model.generic;

import com.digitallab.sigac.commons.enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO implements Serializable {

    private Long documentNumber;
    private Integer idType;
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
