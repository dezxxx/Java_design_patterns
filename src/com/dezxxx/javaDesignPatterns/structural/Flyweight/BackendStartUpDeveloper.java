package com.dezxxx.javaDesignPatterns.structural.Flyweight;

public class BackendStartUpDeveloper implements StartUpDeveloper {
    @Override
    public void develop(String project) {
        System.out.println("Backend developer builds server for " + project);
    }
}
