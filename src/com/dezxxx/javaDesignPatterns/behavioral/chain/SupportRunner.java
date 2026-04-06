package com.dezxxx.javaDesignPatterns.behavioral.chain;

// Runner (запуск цепочки)
public class SupportRunner {

    public static void main(String[] args) {

        Handler basic = new BasicSupport();
        Handler advanced = new AdvancedSupport();
        Handler expert = new ExpertSupport();

        // build chain (строим цепочку)
        basic.setNext(advanced);
        advanced.setNext(expert);

        basic.handle("basic");
        basic.handle("advanced");
        basic.handle("expert");
        basic.handle("unknown");
    }
}