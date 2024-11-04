package com.prueba.gestionriesgos.utils.exception;

import java.io.Serial;

/**
 * Exception when any resource or data is not found.
 */
public class DataNotFoundException extends GeneralRuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public DataNotFoundException(String message) {
        super(message);
    }
}
