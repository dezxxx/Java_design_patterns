package com.dezxxx.javaDesignPatterns.creational.abstractFactory.onlineTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Director;

public class OnlineDirector implements Director {
    @Override
    public void manageStore() {
        System.out.println("Online Director manage store");
    }
}
