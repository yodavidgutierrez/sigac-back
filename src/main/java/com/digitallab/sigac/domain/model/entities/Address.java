package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.domain.model.entities.base.BaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.AuditBaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.Auditable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Address extends BaseEntity implements Auditable, Serializable  {

    @OneToOne
    @JoinColumn(name = "id_person")
    @MapsId
    private Person person;
    @Column(nullable = false)
    private String addresPerson;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumns({
            @JoinColumn(referencedColumnName = "id"),
            @JoinColumn(referencedColumnName = "department")})
    private Municipality municipality;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn( referencedColumnName = "id")
    private Zone zone;

    private AuditBaseEntity audit;

    @Override
    public void setAudit(AuditBaseEntity auditBaseEntity) {
        this.audit = auditBaseEntity;
    }

    @Override
    public AuditBaseEntity getAudit() {
        return audit;
    }
}
