package com.digitallab.sigac.domain.model.entities.base.audit;

public interface Auditable {

    void setAudit(AuditBaseEntity auditBaseEntity);

    AuditBaseEntity getAudit();

}
