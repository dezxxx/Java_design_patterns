package com.dezxxx.javaDesignPatterns.creational.abstractFactory.realTeamFactoryStore;

import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Accountant;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Director;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.Seller;
import com.dezxxx.javaDesignPatterns.creational.abstractFactory.StoreTeamFactory;

public class RealStoreTeamFactory implements StoreTeamFactory {
    @Override
    public Seller getSeller() {
        return new RealSeller();
    }

    @Override
    public Director getDirector() {
        return new RealDirector();
    }

    @Override
    public Accountant getAccountant() {
        return new RealAccountant();
    }
}
