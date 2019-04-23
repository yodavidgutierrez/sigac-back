package com.digitallab.sigac.domain.model.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
public class Department implements Serializable {

    @Id
    private Integer id;
    @Column(nullable = false)
    private String name;
}
