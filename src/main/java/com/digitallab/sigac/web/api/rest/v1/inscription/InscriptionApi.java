package com.digitallab.sigac.web.api.rest.v1.inscription;

import com.digitallab.sigac.commons.model.generic.InscriptionDTO;
import com.digitallab.sigac.commons.model.request.InscriptionDTORequest;

import java.util.List;

public interface InscriptionApi {

    InscriptionDTO createInscription (InscriptionDTO inscription);

    InscriptionDTO findInscription (Integer id);

    List<InscriptionDTO> findAllInscriptions ();

}
