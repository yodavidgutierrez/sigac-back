package com.digitallab.sigac.commons.model.generic;

import com.digitallab.sigac.commons.enums.StudentState;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StudentDTO extends PersonDTO implements Serializable{

    private StudentState studentState;
    private Boolean headFamilyMother;
    private Boolean sonsBeneficiaryFamilyHead;
    private Boolean sonsBeneficiaryVeteranPF;
    private Boolean sonsBeneficiaryNationalHero;
}
