package com.digitallab.sigac.repository.inscription;

import com.digitallab.sigac.domain.model.entities.Inscription;

import java.util.List;

public interface InscriptionRepositoryFacade {

    Inscription createInscription (Inscription inscription);

    Inscription findInscription (Integer id);

    List<Inscription> findAllInscriptions ();


}
