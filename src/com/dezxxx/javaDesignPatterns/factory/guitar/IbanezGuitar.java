package com.dezxxx.javaDesignPatterns.factory.guitar;

import com.dezxxx.javaDesignPatterns.factory.Guitar;

public class IbanezGuitar implements Guitar {
    @Override
    public void playGuitar() {
        System.out.println("Ibanez guitar ready to play....");
    }
}
