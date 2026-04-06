package com.dezxxx.javaDesignPatterns.structural.bridge;

public abstract class Payment {

    protected  PaymentSystem paymentSystem;

    public Payment(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    protected Payment() {
    }

    public abstract void pay (double amount);
}
