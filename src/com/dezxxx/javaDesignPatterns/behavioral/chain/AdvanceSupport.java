package com.dezxxx.javaDesignPatterns.behavioral.chain;

// Advanced Support (продвинутая поддержка)
class AdvancedSupport extends Handler {

    @Override
    public void handle(String request) {
        if (request.equals("advanced")) {
            System.out.println("Handled by Advanced Support");
        } else {
            passToNext(request);
        }
    }
}