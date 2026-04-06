package com.dezxxx.javaDesignPatterns.creational.abstractFactory.realTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Accountant;

public class RealAccountant implements Accountant {
    @Override
    public void calculateBalance() {
        System.out.println("Real store Accountant calculated balance.....");
    }
}
