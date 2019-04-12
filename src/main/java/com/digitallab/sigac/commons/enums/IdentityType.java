package com.digitallab.sigac.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IdentityType {

    CC(0, "Cédula de Ciudadanía."),
    TI(1, "Tarjeta de Identitdad."),
    RC(2, "Registro Civil");

    private final Integer code;
    private final String value;

}
