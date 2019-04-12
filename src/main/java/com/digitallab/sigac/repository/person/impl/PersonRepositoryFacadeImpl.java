package com.digitallab.sigac.repository.person.impl;

import com.digitallab.sigac.domain.model.entities.Person;
import com.digitallab.sigac.repository.person.PersonRepository;
import com.digitallab.sigac.repository.person.PersonRepositoryFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PersonRepositoryFacadeImpl implements PersonRepositoryFacade {

    private final PersonRepository personRepository;

    @Autowired
    public PersonRepositoryFacadeImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> createPerson(Person person) {
        Optional<Person> persona = Optional.ofNullable(personRepository.save(person));
        return persona.isPresent() ?  persona : Optional.of(new Person());
    }

    @Override
    public Optional<Person> findPersonById(Long id) {
        return personRepository.findById(id);
    }

    @Override
    public Optional<Person> findPersonByName(String firstName, String secondName) {
        return personRepository.findByFirstNameOrSecondName(firstName,secondName);
    }

    @Override
    public Optional<Person> findPersonByLastName(String firstLastName, String secondLastName) {
        return Optional.empty();
    }

    @Override
    public Optional<Person> removePersonById(Person person) {
        return Optional.empty();
    }

    @Override
    public Optional<Person> updatePersonById(Person person) {
        return Optional.empty();
    }
}
