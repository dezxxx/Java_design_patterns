package com.dezxxx.javaDesignPatterns.structural.adapter;

public class Adapter extends Logger implements Log{

    @Override
    public void log() {
        logObject();
    }
}
