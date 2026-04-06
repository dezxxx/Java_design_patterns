package com.dezxxx.javaDesignPatterns.structural.bridge;

public class CardPayment implements  PaymentSystem {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment " + amount);
    }
}
