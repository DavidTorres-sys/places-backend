package com.prueba.gestionriesgos.utils.exception;

import java.io.Serial;

/**
 * Exception for duplicated data in the application.
 *
 * This exception is thrown when an attempt to insert or update data
 * in the database results in a conflict due to duplication of data
 * that is supposed to be unique, such as primary keys or unique
 * constraints. This extends the GeneralRuntimeException to provide
 * additional context specific to database operations.
 */
public class DataBaseException extends GeneralRuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DataBaseException with the specified detail message.
     *
     * @param message The detail message explaining the reason for the exception.
     */
    public DataBaseException(String message) {
        super(message);
    }

    /**
     * Constructs a new DataBaseException with the specified detail message
     * and translation key for internationalization.
     *
     * @param message The detail message explaining the reason for the exception.
     * @param translationKey A key used for translating the message into different languages.
     */
    public DataBaseException(String message, String translationKey) {
        super(message, translationKey);
    }
}
