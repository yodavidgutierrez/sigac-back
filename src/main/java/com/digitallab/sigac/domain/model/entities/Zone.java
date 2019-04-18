package com.digitallab.sigac.domain.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Zone {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String nameZone;
}
