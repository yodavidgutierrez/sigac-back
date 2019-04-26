package com.digitallab.sigac.domain.model.entities;


import com.digitallab.sigac.domain.model.entities.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Courses extends BaseEntity {

    private Integer courses;
}
