package com.digitallab.sigac.commons.model.request;

import com.digitallab.sigac.commons.model.generic.InscriptionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class InscriptionDTORequest extends InscriptionDTO implements Serializable {
}
