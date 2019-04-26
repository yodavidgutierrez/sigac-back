package com.digitallab.sigac.web.api.rest.v1.inscription.impl;

import com.digitallab.sigac.commons.model.generic.InscriptionDTO;
import com.digitallab.sigac.commons.model.request.InscriptionDTORequest;
import com.digitallab.sigac.service.inscription.InscriptionService;
import com.digitallab.sigac.web.api.rest.v1.inscription.InscriptionApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscription/v1")
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
public class InscriptionApiImpl implements InscriptionApi {

    private final InscriptionService service;

    @Autowired
    public InscriptionApiImpl(@RequestBody InscriptionService service) {
        this.service = service;
    }

    @PostMapping("/")
    @Override
    public InscriptionDTO createInscription(InscriptionDTO inscription) {
        return service.createInscription(inscription);
    }

    @GetMapping("/{id}")
    @Override
    public InscriptionDTO findInscription(@PathVariable("id") Integer id) {
        return service.findInscription(id);
    }

    @GetMapping("/")
    @Override
    public List<InscriptionDTO> findAllInscriptions() {
        return service.findAllInscriptions();
    }
}
