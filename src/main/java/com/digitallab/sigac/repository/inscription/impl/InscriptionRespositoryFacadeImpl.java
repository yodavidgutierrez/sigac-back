package com.digitallab.sigac.repository.inscription.impl;

import com.digitallab.sigac.domain.model.entities.Inscription;
import com.digitallab.sigac.repository.inscription.InscriptionRepository;
import com.digitallab.sigac.repository.inscription.InscriptionRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InscriptionRespositoryFacadeImpl implements InscriptionRepositoryFacade {

    private final InscriptionRepository repository;

    @Autowired
    public InscriptionRespositoryFacadeImpl(InscriptionRepository repository) {
        this.repository = repository;
    }

    @Override
    public Inscription createInscription(Inscription inscription) {
        return repository.save(inscription);
    }

    @Override
    public Inscription findInscription(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Inscription> findAllInscriptions() {
        return repository.findAll();
    }
}
