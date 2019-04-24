package com.digitallab.sigac.commons.model.generic;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class DisabilityTypeDTO   {

    private Integer id;
    private String disability;
}
