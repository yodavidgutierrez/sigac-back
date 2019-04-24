package com.digitallab.sigac.commons.model.request;

import com.digitallab.sigac.commons.model.generic.StudentDTO;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class StudentDTORequest extends StudentDTO implements Serializable {
}
