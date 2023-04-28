package com.example.demo.fibonacci.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class ExceededMaximumFibonacciPositionException extends RuntimeException {
    public ExceededMaximumFibonacciPositionException(int position) {
        super(String.format("Invalid position argument: %d. The position must be less than or equals 92", position));
    }
}
