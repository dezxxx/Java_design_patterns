package com.dezxxx.javaDesignPatterns.creational.abstractFactory.realTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Director;

public class RealDirector implements Director {
    @Override
    public void manageStore() {
        System.out.println("Real Store Manage Director ......");
    }
}
