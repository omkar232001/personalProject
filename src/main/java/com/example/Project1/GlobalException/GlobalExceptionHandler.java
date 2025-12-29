package com.example.Project1.GlobalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Excehandle.class)
    public ResponseEntity<String> handleResourceNotFound(
            Excehandle ex) {
        return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    }
}

