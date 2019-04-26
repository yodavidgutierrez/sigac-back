package com.digitallab.sigac.repository.inscription;

import com.digitallab.sigac.domain.model.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {
}
