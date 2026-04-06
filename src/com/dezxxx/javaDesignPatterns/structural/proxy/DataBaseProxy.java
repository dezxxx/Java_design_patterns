package com.dezxxx.javaDesignPatterns.structural.proxy;

// Proxy

class DatabaseProxy implements Database {

    private RealDatabase realDatabase;
    private final String password;

    public DatabaseProxy(String password) {
        this.password = password;
    }

    @Override
    public void connect() {
        if (checkAccess()) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase(); // lazy initialization
            }
            realDatabase.connect();
        } else {
            System.out.println("Access denied!");
        }
    }

    private boolean checkAccess() {
        return "1234".equals(password);
    }
}