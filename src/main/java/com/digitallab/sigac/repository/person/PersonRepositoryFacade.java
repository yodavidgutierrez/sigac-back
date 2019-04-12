package com.digitallab.sigac.repository.person;

import com.digitallab.sigac.domain.model.entities.Person;
import org.springframework.lang.Nullable;

import java.util.Optional;

public interface PersonRepositoryFacade {

    Optional<Person> createPerson(final Person person);

    Optional<Person> findPersonById(final Long id);

    Optional<Person> findPersonByName(final String firstName, @Nullable final String secondName);

    Optional<Person> findPersonByLastName(final String firstLastName, @Nullable final String secondLastName);

    Optional<Person> removePersonById(final Person person);

    Optional<Person> updatePersonById(final Person person);

}
