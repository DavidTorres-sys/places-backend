package com.prueba.gestionriesgos.utils.handler;

import com.prueba.gestionriesgos.utils.common.StandardResponse;
import com.prueba.gestionriesgos.utils.exception.BusinessException;
import com.prueba.gestionriesgos.utils.exception.DataDuplicatedException;
import com.prueba.gestionriesgos.utils.exception.DataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<StandardResponse<String>> handleBusinessException(BusinessException ex) {
        return new ResponseEntity<>(new StandardResponse<>(StandardResponse.StatusStandardResponse.ERROR, ex.getMessage()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DataNotFoundException.class)
    protected ResponseEntity<StandardResponse<String>> handleDataNotFoundException(DataNotFoundException ex) {
        return new ResponseEntity<>(new StandardResponse<>(StandardResponse.StatusStandardResponse.ERROR, ex.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataDuplicatedException.class)
    protected ResponseEntity<StandardResponse<String>> handleDataDuplicatedException(DataDuplicatedException ex) {
        return new ResponseEntity<>(new StandardResponse<>(StandardResponse.StatusStandardResponse.ERROR, ex.getMessage()), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<StandardResponse<String>> handleIllegalArgumentException(IllegalArgumentException ex) {
        return new ResponseEntity<>(new StandardResponse<>(StandardResponse.StatusStandardResponse.ERROR, ex.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Throwable.class)
    protected ResponseEntity<StandardResponse<String>> handleThrowable(Throwable ex) {
        return new ResponseEntity<>(new StandardResponse<>(StandardResponse.StatusStandardResponse.ERROR, "No se ha podido procesar su solicitud. Contacte al administrdor."), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

