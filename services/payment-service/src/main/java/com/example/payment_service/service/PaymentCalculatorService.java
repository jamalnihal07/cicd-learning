package com.example.payment_service.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentCalculatorService {

    public double calculateFinalAmount(double amount, double taxPercentage) {

        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }

        if (taxPercentage < 0) {
            throw new IllegalArgumentException("Tax percentage cannot be negative");
        }

        return amount + (amount * taxPercentage / 100);
    }
}
