package com.digitallab.sigac.commons.model.generic;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class EthnicGroupDTO {

    private Integer id;
    private String nameEthnic;
}
