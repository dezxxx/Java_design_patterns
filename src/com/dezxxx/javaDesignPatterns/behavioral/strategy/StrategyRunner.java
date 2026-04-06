package com.dezxxx.javaDesignPatterns.behavioral.strategy;

public class StrategyRunner {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.executePayment(100);

        context.setStrategy(new PayPalPayment());
        context.executePayment(200);

        context.setStrategy(new CryptoPayment());
        context.executePayment(300);
    }
}