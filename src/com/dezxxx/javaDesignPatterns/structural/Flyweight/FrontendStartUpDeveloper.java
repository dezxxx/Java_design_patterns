package com.dezxxx.javaDesignPatterns.structural.Flyweight;

public class FrontendStartUpDeveloper implements StartUpDeveloper {
    @Override
    public void develop(String project) {
        System.out.println("Frontend developer builds UI for " + project);
    }
}
