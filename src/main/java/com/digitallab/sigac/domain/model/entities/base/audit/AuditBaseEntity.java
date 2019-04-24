package com.digitallab.sigac.domain.model.entities.base.audit;

import com.digitallab.sigac.commons.enums.Audit;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Embeddable
@MappedSuperclass
@Data
@NoArgsConstructor
public class AuditBaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private Audit state;

    private LocalDateTime updateTime;
    @Column(nullable = false)
    private LocalDateTime creationTime;
    /*@Column(nullable = false)
    private String userName;*/

}
