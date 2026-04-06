package com.dezxxx.javaDesignPatterns.behavioral.chain;

// Abstract Handler (абстрактный обработчик)
abstract class Handler {

    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    protected void passToNext(String request) {
        if (next != null) {
            next.handle(request);
        }
    }

    public abstract void handle(String request);
}