package com.example.order_service.service;

import org.springframework.stereotype.Service;

@Service
public class OrderCalculatorService {

    public int calculateTotal(int itemPrice, int quantity) {

        if (itemPrice < 0) {
            throw new IllegalArgumentException("Item price cannot be negative");
        }

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        return itemPrice * quantity;
    }
}
