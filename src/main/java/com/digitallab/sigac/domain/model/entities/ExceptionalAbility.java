package com.digitallab.sigac.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ExceptionalAbility {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String ability;
}
