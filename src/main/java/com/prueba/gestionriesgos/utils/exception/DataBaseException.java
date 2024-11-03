package com.prueba.gestionriesgos.utils.exception;

import java.io.Serial;

/**
 * Exception for duplicated data in the application
 */
public class DataBaseException extends GeneralRuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public DataBaseException(String message) {
        super(message);
    }

    public DataBaseException(String message, String translationKey) {
        super(message, translationKey);
    }

}