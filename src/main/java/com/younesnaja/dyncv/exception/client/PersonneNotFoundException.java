package com.younesnaja.dyncv.exception.client;

import com.younesnaja.dyncv.exception.ExceptionMessages;

import java.math.BigInteger;

public class PersonneNotFoundException extends PersonneException {

    public PersonneNotFoundException(BigInteger id) {
        super(ExceptionMessages.PERSONNE_NOT_FOUND, id.toString());
    }
}
