package com.dezxxx.javaDesignPatterns.creational.abstractFactory.Stores;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Accountant;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Director;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Seller;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.StoreTeamFactory;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.realTeamFactoryStore.RealStoreTeamFactory;

public class RealStore {
    public static void main(String[] args) {
       StoreTeamFactory storeTeamFactory = new RealStoreTeamFactory();
        Seller seller = storeTeamFactory.getSeller();
        Accountant accountant = storeTeamFactory.getAccountant();
        Director  director = storeTeamFactory.getDirector();

        System.out.println("------Creating Real Store-----");
        seller.sellProduct();
        accountant.calculateBalance();
        director.manageStore();
    }
}
