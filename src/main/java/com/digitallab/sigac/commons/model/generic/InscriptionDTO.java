package com.digitallab.sigac.commons.model.generic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InscriptionDTO implements Serializable {
    private Integer inscriptionNumber;
    private Date inscriptionDate;
    private Date fingeringDate;
    private Integer year;
    private CoursesDTO grade;
    private Boolean canceled;
    private String comments;
    private String privateSector;
    private String academicSituation;
}
