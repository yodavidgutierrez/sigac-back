package com.digitallab.sigac.domain.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department implements Serializable {

    @Id
    @Column(name = "`id`")
    private Integer id;
    @Column(insertable = false, updatable = false)
    private String name;

    public Department(Integer id) {
        this.id = id;
    }
}
