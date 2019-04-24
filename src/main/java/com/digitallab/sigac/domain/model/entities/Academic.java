package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.commons.enums.AcademicCharacter;
import com.digitallab.sigac.commons.enums.AcademicSpeciality;
import com.digitallab.sigac.domain.model.entities.base.BaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.AuditBaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.Auditable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Academic extends BaseEntity implements Serializable, Auditable {

    private AcademicCharacter character;
    private AcademicSpeciality speciality;
    private Boolean isEnrollmentPayment;

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
