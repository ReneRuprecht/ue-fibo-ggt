package com.example.demo.fibonacci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class NegativeFibonacciPositionException extends RuntimeException {
    public NegativeFibonacciPositionException(int position) {
        super(String.format("Invalid position argument: %d. The position must be equals or greater than 0", position));
    }
}
