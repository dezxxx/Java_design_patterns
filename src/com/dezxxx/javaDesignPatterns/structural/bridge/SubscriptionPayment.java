package com.dezxxx.javaDesignPatterns.structural.bridge;

public class SubscriptionPayment extends Payment{

    public SubscriptionPayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Subscription Payment starting ");
        paymentSystem.processPayment(amount);
    }
}
