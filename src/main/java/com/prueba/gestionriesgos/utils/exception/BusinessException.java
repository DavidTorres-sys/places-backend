package com.prueba.gestionriesgos.utils.exception;

import java.io.Serial;

/**
 * Exception for duplicated data in the application
 */
public class BusinessException extends GeneralRuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, String translationKey) {
        super(message, translationKey);
    }

}