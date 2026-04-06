package com.dezxxx.javaDesignPatterns.creational.factory.guitar;

import com.dezxxx.javaDesignPatterns.creational.factory.Guitar;

public class LtdByEspGuitar implements Guitar {
    @Override
    public void playGuitar() {
        System.out.println("LTD by ESP guitar ready to play.....");
    }
}
