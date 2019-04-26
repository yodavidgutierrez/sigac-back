package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.commons.enums.Genre;
import com.digitallab.sigac.commons.enums.IdentityType;
import com.digitallab.sigac.domain.model.entities.base.BaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.AuditBaseEntity;
import com.digitallab.sigac.domain.model.entities.base.audit.AuditListener;
import com.digitallab.sigac.domain.model.entities.base.audit.Auditable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@EqualsAndHashCode(of = {"idPerson"})
@Data
@NoArgsConstructor
@Inheritance(
        strategy = InheritanceType.JOINED
)
@EntityListeners(AuditListener.class)
public class Person extends BaseEntity implements Auditable, Serializable {


    @Column(unique = true, nullable = false)
    private Long documentNumber;
    @Enumerated(EnumType.ORDINAL)
    private IdentityType idType;
    private String firstLastName;
    private String secondLastName;
    private String firstName;
    private String secondName;
    private Date birthDate;
    private Integer stratum;
    private Integer sisben;
    @Column(unique = true)
    private String email;
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(referencedColumnName = "id", nullable = false),
            @JoinColumn(referencedColumnName = "department", nullable = false)})
    private Municipality municipality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private DisabilityType disabilityType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private ExceptionalAbility exceptionalAbility;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private EthnicGroup ethnicGroup;

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
