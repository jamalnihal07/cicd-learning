package com.example.order_service.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderCalculatorServiceTest {

    private final OrderCalculatorService orderCalculatorService =
            new OrderCalculatorService();

    @Test
    void shouldCalculateOrderTotal() {

        int result = orderCalculatorService.calculateTotal(100, 3);

        assertEquals(300, result);
    }

    @Test
    void shouldRejectNegativeItemPrice() {

        assertThrows(
                IllegalArgumentException.class,
                () -> orderCalculatorService.calculateTotal(-100, 2)
        );
    }

    @Test
    void shouldRejectNegativeQuantity() {

        assertThrows(
                IllegalArgumentException.class,
                () -> orderCalculatorService.calculateTotal(100, -2)
        );
    }
}
