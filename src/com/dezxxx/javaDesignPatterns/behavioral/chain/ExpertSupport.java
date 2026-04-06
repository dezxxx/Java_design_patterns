package com.dezxxx.javaDesignPatterns.behavioral.chain;

// Expert Support (экспертная поддержка)
class ExpertSupport extends Handler {

    @Override
    public void handle(String request) {
        if (request.equals("expert")) {
            System.out.println("Handled by Expert Support");
        } else {
            System.out.println("Request not handled");
        }
    }
}