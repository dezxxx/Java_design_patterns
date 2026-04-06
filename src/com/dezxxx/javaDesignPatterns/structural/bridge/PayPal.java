package com.dezxxx.javaDesignPatterns.structural.bridge;

public class PayPal implements PaymentSystem {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment " + amount);
    }
}
