package com.dezxxx.javaDesignPatterns.creational.factory.guitar;

import com.dezxxx.javaDesignPatterns.creational.factory.Guitar;

public class IbanezGuitar implements Guitar {
    @Override
    public void playGuitar() {
        System.out.println("Ibanez guitar ready to play....");
    }
}
