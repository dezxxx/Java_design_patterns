package com.dezxxx.javaDesignPatterns.structural.adapter;

public class RunnerLogger {
    public static void main(String[] args) {
        Log log = new Adapter();
        log.log();
    }
}
