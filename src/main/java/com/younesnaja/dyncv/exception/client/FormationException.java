package com.younesnaja.dyncv.exception.client;

import com.younesnaja.dyncv.exception.ExceptionMessages;


public abstract class FormationException extends RuntimeException {

    public FormationException(String message, String... param) {
        super(ExceptionMessages.getMessage(message, param));
    }
}
