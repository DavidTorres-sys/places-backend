package com.prueba.gestionriesgos.utils.exception;

import java.io.Serial;

/**
 * Exception for duplicated data in the application.
 *
 * This exception is thrown when an attempt to insert or update data
 * in the application results in a conflict due to duplication of data
 * that is supposed to be unique, such as primary keys or unique
 * constraints. This extends the GeneralRuntimeException to provide
 * additional context specific to data integrity violations.
 */
public class DataDuplicatedException extends GeneralRuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DataDuplicatedException with the specified detail message.
     *
     * @param message The detail message explaining the reason for the exception.
     */
    public DataDuplicatedException(String message) {
        super(message);
    }
}
