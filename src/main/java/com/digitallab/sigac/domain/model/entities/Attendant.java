package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.domain.model.entities.base.audit.AuditBaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.Auditable;
import com.digitallab.sigac.domain.model.entities.base.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity
@Data
@NoArgsConstructor
@EntityListeners(AuditBaseEntity.class)
public class Attendant extends BaseEntity implements Auditable {

    private String Occupation;

    @Embedded
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
