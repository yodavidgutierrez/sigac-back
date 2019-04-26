package com.digitallab.sigac.service.inscription.impl;

import com.digitallab.sigac.commons.model.generic.InscriptionDTO;
import com.digitallab.sigac.commons.model.request.InscriptionDTORequest;
import com.digitallab.sigac.domain.model.entities.Inscription;
import com.digitallab.sigac.repository.inscription.InscriptionRepositoryFacade;
import com.digitallab.sigac.service.inscription.InscriptionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class InscriptionServiceImpl implements InscriptionService {

    private final InscriptionRepositoryFacade repository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    public InscriptionServiceImpl(InscriptionRepositoryFacade repository) {
        this.repository = repository;
    }

    @Override
    public InscriptionDTO createInscription(InscriptionDTO inscription) {
        return mapper.map(repository.createInscription(mapper.map(inscription, Inscription.class)), InscriptionDTO.class);
    }

    @Override
    public InscriptionDTO findInscription(Integer id) {
        return mapper.map(repository.findInscription(id), InscriptionDTO.class);
    }

    @Override
    public List<InscriptionDTO> findAllInscriptions() {
        return repository.findAllInscriptions().stream()
                .map(inscription -> mapper.map(inscription, InscriptionDTO.class))
                .collect(Collectors.toList());
    }
}
