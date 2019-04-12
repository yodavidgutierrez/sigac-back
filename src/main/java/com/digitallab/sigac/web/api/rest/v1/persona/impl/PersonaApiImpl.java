package com.digitallab.sigac.web.api.rest.v1.persona.impl;

import com.digitallab.sigac.commons.model.generic.PersonDTO;
import com.digitallab.sigac.domain.model.entities.Person;
import com.digitallab.sigac.repository.person.PersonRepositoryFacade;
import com.digitallab.sigac.web.api.rest.v1.persona.PersonaApi;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/person/v1", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class PersonaApiImpl implements PersonaApi {

    private final PersonRepositoryFacade personRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public PersonaApiImpl(PersonRepositoryFacade personRepositoryFacade) {
        this.personRepository = personRepositoryFacade;
    }

    @Override
    @PostMapping(value = "/")
    public ResponseEntity<Person> createPerson(Person person) {
        return ResponseEntity.ok(personRepository.createPerson(person).get());
    }

    @Override
    @GetMapping(value = "/{id}")
    public ResponseEntity<PersonDTO> findPersonById(@PathVariable("id") Long id) {
        Optional<Person> person = personRepository.findPersonById(id);

        return person.isPresent() ?
                ResponseEntity.ok(modelMapper.map(person.get(), PersonDTO.class)) :
                ResponseEntity.status(HttpStatus.NOT_FOUND).body(new PersonDTO());
    }

}
