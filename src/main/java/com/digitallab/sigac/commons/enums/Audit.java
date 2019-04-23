package com.digitallab.sigac.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Audit {

    INSERT(0,"I"), UPDATE(1,"U"), DELETE(2,"D");

    private final Integer id;
    private final String type;



}
