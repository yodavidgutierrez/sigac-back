package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.domain.model.entities.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DisabilityType extends BaseEntity {

    @Column(nullable = false)
    private String disability;
}
