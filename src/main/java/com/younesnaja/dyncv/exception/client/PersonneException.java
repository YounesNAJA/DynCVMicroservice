package com.younesnaja.dyncv.exception.client;

import com.younesnaja.dyncv.exception.ExceptionMessages;


public abstract class PersonneException extends RuntimeException {

    public PersonneException(String message, String... param) {
        super(ExceptionMessages.getMessage(message, param));
    }
}
