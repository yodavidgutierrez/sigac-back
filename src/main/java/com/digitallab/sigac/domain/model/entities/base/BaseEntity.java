package com.digitallab.sigac.domain.model.entities.base;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Version
    private Integer version;



}
