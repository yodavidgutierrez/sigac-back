package com.digitallab.sigac.domain.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Attendant extends BaseEntity{

    @Id
    private BigInteger id;
    private String Occupation;

}
