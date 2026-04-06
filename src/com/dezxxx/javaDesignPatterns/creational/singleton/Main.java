package com.dezxxx.javaDesignPatterns.creational.singleton;
public class Main {

    public static void main(String[] args) {

        System.out.println("Start app");

        String apiUrl = ConfigManager.getInstance()
                .get("payment.api.url");

        System.out.println("API URL: " + apiUrl);

        // проверка singleton
        ConfigManager.getInstance();
        ConfigManager.getInstance();
    }
}