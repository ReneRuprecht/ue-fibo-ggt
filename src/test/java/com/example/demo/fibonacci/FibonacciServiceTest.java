package com.example.demo.fibonacci;

import com.example.demo.fibonacci.exception.ExceededMaximumFibonacciPositionException;
import com.example.demo.fibonacci.exception.NegativeFibonacciPositionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

class FibonacciServiceTest {

    private FibonacciService underTest;

    @BeforeEach
    void setUp() {
        underTest = new FibonacciService();
    }

    @Test
    void getFibonacciPosition_whenPositionIsEqualTo10_thenReturn55() {

        int position = 10;
        Long expected = 55L;

        Long result = underTest.getFibonacciPosition(position);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getFibonacciPosition_whenPositionIsEqualsTo0_thenReturn0() {
        int position = 0;
        Long expected = 0L;

        Long result = underTest.getFibonacciPosition(position);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void getFibonacciPosition_whenPositionIsEqualsTo1_thenReturn1() {
        int position = 1;
        Long expected = 1L;

        Long result = underTest.getFibonacciPosition(position);

        assertThat(result).isEqualTo(expected);
    }
    @Test
    void getFibonacciPosition_WhenPositionIsEqualToNegative1_thenThrowInvalidFibonacciPosition() {
        int position = -1;

        assertThatThrownBy(() -> underTest.getFibonacciPosition(position))
                .isInstanceOf(NegativeFibonacciPositionException.class)
                .hasMessage(String.format("Invalid position argument: %d. The position must be equals or greater than 0", position));
    }

    @Test
    void getFibonacciPosition_whenPositionIsGreaterThan92_thenThrowExceededMaximumFibonacciPositionException() {
        int position = 93;

        assertThatThrownBy(() -> underTest.getFibonacciPosition(position))
                .isInstanceOf(ExceededMaximumFibonacciPositionException.class)
                .hasMessage(String.format("Invalid position argument: %d. The position must be less than or equals 92", position));
    }
}