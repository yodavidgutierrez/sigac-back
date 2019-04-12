package com.digitallab.sigac.domain.model.entities;

import com.digitallab.sigac.commons.enums.Audit;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;

@MappedSuperclass
@Data
@NoArgsConstructor
public class BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Audit state;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar createTime;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar actionTime;
    @Column(nullable = false)
    private String userName;

}
