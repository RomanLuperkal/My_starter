package com.example.mystarter.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MyException extends RuntimeException {
    private String message;
}
