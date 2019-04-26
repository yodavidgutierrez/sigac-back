package com.digitallab.sigac.service.inscription;

import com.digitallab.sigac.commons.model.generic.InscriptionDTO;
import com.digitallab.sigac.commons.model.request.InscriptionDTORequest;

import java.util.List;

public interface InscriptionService {

    InscriptionDTO createInscription (InscriptionDTO inscription);

    InscriptionDTO findInscription (Integer id);

    List<InscriptionDTO> findAllInscriptions ();

}
