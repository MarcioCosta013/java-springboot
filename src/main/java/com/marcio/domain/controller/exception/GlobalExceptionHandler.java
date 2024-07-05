package com.marcio.domain.controller.exception;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handlerBusinessException(IllegalArgumentException businessException){
        //Um ResponseEntity com status code de negócio.
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY); //erro 422
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlerNotFoundException(NoSuchElementException notFoundException){
        
        return new ResponseEntity<>("Resouce ID not found.", HttpStatus.NOT_FOUND); //erro 404
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlerUnexpectedException(Throwable unexpectedException){
        //Qualquer outra excesao que surgir...
        var message = "Unexpected server error, see logs.";
        logger.error(message, unexpectedException);
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR); //erro 500
    }
}
