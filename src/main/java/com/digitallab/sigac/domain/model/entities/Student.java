package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.commons.enums.StudentState;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Student extends Person {

    private StudentState studentState;
    private Boolean headFamilyMother;
    private Boolean sonsBeneficiaryFamilyHead;
    private Boolean sonsBeneficiaryVeteranPF;
    private Boolean sonsBeneficiaryNationalHero;
    private Academic academicState;

}
