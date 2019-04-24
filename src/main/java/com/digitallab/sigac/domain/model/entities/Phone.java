package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.domain.model.entities.base.audit.AuditBaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.Auditable;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EqualsAndHashCode(callSuper = false)
public class Phone implements Auditable, Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false, unique = true)
    private String phonePerson;

    private AuditBaseEntity auditBaseEntity;

    @Override
    public void setAudit(AuditBaseEntity auditBaseEntity) {
        this.auditBaseEntity = auditBaseEntity;
    }

    @Override
    public AuditBaseEntity getAudit() {
        return auditBaseEntity;
    }
}
