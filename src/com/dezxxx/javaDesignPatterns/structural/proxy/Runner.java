package com.dezxxx.javaDesignPatterns.structural.proxy;

// Runner
public class Runner {
    public static void main(String[] args) {

        Database db = new DatabaseProxy("1234");
        db.connect();

        Database dbFail = new DatabaseProxy("wrong");
        dbFail.connect();
    }
}