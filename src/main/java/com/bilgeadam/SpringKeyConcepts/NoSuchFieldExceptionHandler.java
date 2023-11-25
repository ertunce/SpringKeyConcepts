package com.bilgeadam.SpringKeyConcepts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NoSuchFieldExceptionHandler {

    @ExceptionHandler(NoSuchFieldException.class)
    public ResponseEntity<Object> handleException(NoSuchFieldException exp){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}

