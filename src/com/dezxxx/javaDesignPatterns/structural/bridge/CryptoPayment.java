package com.dezxxx.javaDesignPatterns.structural.bridge;

public class CryptoPayment implements PaymentSystem {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Crypto Payment " + amount);
    }
}
