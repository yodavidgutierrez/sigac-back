package com.digitallab.sigac.repository.person;

import com.digitallab.sigac.domain.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Optional<Person> findByFirstNameOrSecondName(final String firstName, final String secondName);

}
