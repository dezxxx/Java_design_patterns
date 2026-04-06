package com.dezxxx.javaDesignPatterns.behavioral.memento;

import java.time.LocalDateTime;

class Memento {

    private final String state;
    private final LocalDateTime createdAt;

    public Memento(String state) {
        this.state = state;
        this.createdAt = LocalDateTime.now();
    }

    public String getState() {
        return state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}