package com.example.mystarter.handler;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class ErrorHandler {

    @ExceptionHandler(RuntimeException.class)
    private ResponseEntity<MyException> handleException(RuntimeException e) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new MyException(e.getMessage()));
    }
}
