package com.digitallab.sigac.commons.model.generic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CaseFileDocumentDTO implements Serializable {
    private PersonDTO person;
    private LocalDate caseFileDate;
    private MunicipalityDTO municipality;
}
