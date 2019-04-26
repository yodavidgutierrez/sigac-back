package com.digitallab.sigac.domain.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Inscription implements Serializable {

    @Id
    @GeneratedValue
    private Integer inscriptionNumber;
    private Date inscriptionDate;
    private Date fingeringDate;
    private Integer year;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private Courses grade;
    private Boolean canceled;
    private String comments;
    private String privateSector;
    private String academicSituation;


}
