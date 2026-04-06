package com.dezxxx.javaDesignPatterns.creational.abstractFactory.onlineTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Seller;

public class OnlineSeller implements Seller {
    @Override
    public void sellProduct() {
        System.out.println("Online Seller sell product");
    }
}
