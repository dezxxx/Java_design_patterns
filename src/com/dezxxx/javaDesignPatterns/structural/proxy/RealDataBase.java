package com.dezxxx.javaDesignPatterns.structural.proxy;

// Real object
class RealDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting to database...");
    }
}