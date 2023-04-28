package com.example.demo.greatestcommondivisor;

import org.springframework.stereotype.Service;

@Service
public class GreatestCommonDivisorService {
    public int getGreatestCommonDivisor(int value1, int value2) {

        if (value1 == 0 && value2 != 0) return value2;

        int result = 1;

        for (int i = 1; i <= value1 && i <= value2; i++) {
            if (value1 % i == 0 && value2 % i == 0) {
                result = i;
            }
        }

        return result;
    }
}
