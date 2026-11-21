package com.example.cicd_learning.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void shouldAddTwoNumbers() {
        int result = calculatorService.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        int result = calculatorService.subtract(20, 10);

        assertEquals(10, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int result = calculatorService.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        int result = calculatorService.divide(20, 5);

        assertEquals(4, result);
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculatorService.divide(20, 0)
        );
    }
}
