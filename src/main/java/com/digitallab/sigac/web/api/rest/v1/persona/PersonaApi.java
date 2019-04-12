package com.digitallab.sigac.web.api.rest.v1.persona;

import com.digitallab.sigac.commons.model.generic.PersonDTO;
import com.digitallab.sigac.domain.model.entities.Person;
import org.springframework.http.ResponseEntity;

public interface PersonaApi {

    ResponseEntity<Person> createPerson(final Person person);

    ResponseEntity<PersonDTO> findPersonById(final Long id);

}
