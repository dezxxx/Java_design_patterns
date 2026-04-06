package com.dezxxx.javaDesignPatterns.behavioral.strategy;

public class CryptoPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Crypto");
    }
}