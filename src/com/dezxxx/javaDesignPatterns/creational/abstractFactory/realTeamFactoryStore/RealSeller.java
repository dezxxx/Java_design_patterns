package com.dezxxx.javaDesignPatterns.creational.abstractFactory.realTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Seller;

public class RealSeller implements Seller {
    @Override
    public void sellProduct() {
        System.out.println("Real store Seller sell product...");
    }
}
