package com.younesnaja.dyncv.exception.client;

import com.younesnaja.dyncv.exception.ExceptionMessages;

import java.math.BigInteger;

public class FormationNotFoundException extends FormationException {

    public FormationNotFoundException(BigInteger id) {
        super(ExceptionMessages.FORMATION_NOT_FOUND, id.toString());
    }
}
