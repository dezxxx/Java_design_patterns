package com.dezxxx.javaDesignPatterns.creational.abstractFactory.onlineTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Accountant;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Director;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Seller;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.StoreTeamFactory;

public class OnlineStoreTeamFactory implements StoreTeamFactory {
    @Override
    public Accountant getAccountant() {
        return new OnlineAccountant();
    }

    @Override
    public Seller getSeller() {
        return new OnlineSeller();
    }

    @Override
    public Director getDirector() {
        return new OnlineDirector();
    }
}
