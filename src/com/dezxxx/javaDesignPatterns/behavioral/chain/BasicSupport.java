package com.dezxxx.javaDesignPatterns.behavioral.chain;

// Basic Support (базовая поддержка)
class BasicSupport extends Handler {

    @Override
    public void handle(String request) {
        if (request.equals("basic")) {
            System.out.println("Handled by Basic Support");
        } else {
            passToNext(request);
        }
    }
}
