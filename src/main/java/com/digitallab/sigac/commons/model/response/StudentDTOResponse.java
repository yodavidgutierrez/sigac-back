package com.digitallab.sigac.commons.model.response;

import com.digitallab.sigac.commons.enums.StudentState;
import com.digitallab.sigac.commons.model.generic.StudentDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTOResponse implements Serializable {

    private StudentState state;
    private Integer id;
    private StudentDTO student;

}
