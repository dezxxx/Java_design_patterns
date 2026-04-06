package com.dezxxx.javaDesignPatterns.behavioral.strategy;

public class PaymentContext {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set");
        }
        strategy.pay(amount);
    }
}