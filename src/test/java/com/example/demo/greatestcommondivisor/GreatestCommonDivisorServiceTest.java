package com.example.demo.greatestcommondivisor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GreatestCommonDivisorServiceTest {

    private GreatestCommonDivisorService underTest;

    @BeforeEach
    void setUp() {
        underTest = new GreatestCommonDivisorService();
    }

    @Test
    void getGreatestCommonDivisor_whenVal1IsEqualTo42AndVal2IsEqualTo140_thenReturn14() {
        int val1 = 42;
        int val2 = 140;

        int expected = 14;

        int result = underTest.getGreatestCommonDivisor(val1, val2);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getGreatestCommonDivisor_whenVal1IsEqualTo0AndVal2IsEqualTo140_thenReturn140() {
        int val1 = 0;
        int val2 = 140;

        int expected = 140;

        int result = underTest.getGreatestCommonDivisor(val1, val2);

        assertThat(result).isEqualTo(expected);
    }
}