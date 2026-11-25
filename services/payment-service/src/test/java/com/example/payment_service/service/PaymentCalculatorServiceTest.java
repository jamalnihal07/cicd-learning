package com.example.payment_service.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentCalculatorServiceTest {

    private final PaymentCalculatorService paymentCalculatorService =
            new PaymentCalculatorService();

    @Test
    void shouldCalculateFinalPaymentAmount() {

        double result =
                paymentCalculatorService.calculateFinalAmount(1000, 18);

        assertEquals(1180, result);
    }

    @Test
    void shouldRejectNegativeAmount() {

        assertThrows(
                IllegalArgumentException.class,
                () -> paymentCalculatorService.calculateFinalAmount(-1000, 18)
        );
    }

    @Test
    void shouldRejectNegativeTaxPercentage() {

        assertThrows(
                IllegalArgumentException.class,
                () -> paymentCalculatorService.calculateFinalAmount(1000, -18)
        );
    }
}
