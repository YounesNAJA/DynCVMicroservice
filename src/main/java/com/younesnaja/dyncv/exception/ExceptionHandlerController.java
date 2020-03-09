package com.younesnaja.dyncv.exception;

import com.younesnaja.dyncv.exception.client.FormationNotFoundException;
import org.springframework.data.repository.support.QueryMethodParameterConversionException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(FormationNotFoundException.class)
    public void handleFormationNotFound(FormationNotFoundException exception, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_FOUND, exception.getMessage());
    }

    @ExceptionHandler(QueryMethodParameterConversionException.class)
    public void handleQueryMethodParameterConversionException(QueryMethodParameterConversionException exception, HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, ExceptionMessages.PARAMETRE_INVALIDE);
    }

}
