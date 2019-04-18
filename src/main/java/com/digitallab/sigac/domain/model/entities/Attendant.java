package com.digitallab.sigac.domain.model.entities;

import javax.persistence.Entity;
import java.math.BigInteger;

@Entity
public class Attendant extends BaseEntity{

    private BigInteger id;
    private String Occupation;

}
