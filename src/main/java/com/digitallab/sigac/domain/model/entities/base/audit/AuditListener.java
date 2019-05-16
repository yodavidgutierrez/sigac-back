package com.digitallab.sigac.domain.model.entities.base.audit;

import com.digitallab.sigac.commons.enums.Audit;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

public class AuditListener {

    @PrePersist
    public void setCreatedOn(Auditable auditable) {

        AuditBaseEntity audit = auditable.getAudit();

        if (audit == null) {
            audit = new AuditBaseEntity();
            auditable.setAudit(audit);
        }
        audit.setCreationTime(LocalDateTime.now());
        audit.setState(Audit.INSERT);
    }


    @PreUpdate
    public void setUpdateOn(Auditable auditable) {
        AuditBaseEntity audit = auditable.getAudit();
        audit.setUpdateTime(LocalDateTime.now());
        audit.setState(Audit.UPDATE);
    }


}
