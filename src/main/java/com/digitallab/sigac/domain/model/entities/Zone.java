package com.digitallab.sigac.domain.model.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Zone {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String zone;
}
