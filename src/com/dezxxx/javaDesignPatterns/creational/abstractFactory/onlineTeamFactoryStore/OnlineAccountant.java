package com.dezxxx.javaDesignPatterns.creational.abstractFactory.onlineTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Accountant;

public class OnlineAccountant implements Accountant {
    @Override
    public void calculateBalance() {
        System.out.println("Online Accountant calculate balance...");
    }
}
