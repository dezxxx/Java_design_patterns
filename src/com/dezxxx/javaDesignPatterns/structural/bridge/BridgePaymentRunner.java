package com.dezxxx.javaDesignPatterns.structural.bridge;

public class BridgePaymentRunner {
    public static void main(String[] args) {
        Payment oneTimePayment = new OneTimePayment(new CardPayment());

        Payment subPayPalPayment  = new SubscriptionPayment(new PayPal());

        Payment oneTimeCryptoPayment = new OneTimePayment(new CryptoPayment());

        oneTimePayment.pay(240);
        System.out.println("========================");
        subPayPalPayment.pay(30.7);
        System.out.println("========================");
        oneTimeCryptoPayment.pay(240);

    }
}
