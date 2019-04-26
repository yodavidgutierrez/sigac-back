package com.digitallab.sigac.commons.model.response;

import com.digitallab.sigac.commons.model.generic.InscriptionDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InplementsDTOResponse implements Serializable {

    private Integer id;
    private InscriptionDTO inscription;
}
