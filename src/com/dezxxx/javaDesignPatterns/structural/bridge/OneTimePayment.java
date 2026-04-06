package com.dezxxx.javaDesignPatterns.structural.bridge;

public class OneTimePayment extends Payment{

    public OneTimePayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void pay(double amount) {
        System.out.println("One Time Payment starting ");
        paymentSystem.processPayment(amount);
    }
}
