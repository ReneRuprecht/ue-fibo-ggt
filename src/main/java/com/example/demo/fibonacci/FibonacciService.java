package com.example.demo.fibonacci;

import com.example.demo.fibonacci.exception.ExceededMaximumFibonacciPositionException;
import com.example.demo.fibonacci.exception.NegativeFibonacciPositionException;
import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    private static final int MAX_FIBONACCI_POSITION = 93;

    public Long getFibonacciPosition(int position) {
        if (position < 0) throw new NegativeFibonacciPositionException(position);
        if (position >= MAX_FIBONACCI_POSITION) throw new ExceededMaximumFibonacciPositionException(position);

        if (position == 0 || position == 1) return (long) position;

        long number1 = 0;
        long number2 = 1;
        long result = 0;

        for (int i = 2; i <= position; i++) {
            result = number1 + number2;
            number1 = number2;
            number2 = result;
        }
        return result;
    }
}
