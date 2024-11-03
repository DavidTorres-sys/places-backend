package com.prueba.gestionriesgos.utils.exception;

import java.io.Serial;

/**
 * Exception for duplicated data in the application
 */
public class DataDuplicatedException extends GeneralRuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public DataDuplicatedException(String message) {
        super(message);
    }
}