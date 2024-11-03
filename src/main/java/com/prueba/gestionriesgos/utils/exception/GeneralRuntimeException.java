package com.prueba.gestionriesgos.utils.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;

/**
 * Generic abstract exception created to identify all Exceptions.
 */
@Getter
@Setter
public class GeneralRuntimeException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private final String message;
    private final String translationKey;


    public GeneralRuntimeException(String message) {
        super(message);
        this.message = message;
        this.translationKey = null;
    }

    public GeneralRuntimeException(String message, Throwable throwable) {
        super(message, throwable);
        this.message = message;
        this.translationKey = null;
    }

    public GeneralRuntimeException(String message, String translationKey) {
        super(message);
        this.message = message;
        this.translationKey = translationKey;
    }

}
