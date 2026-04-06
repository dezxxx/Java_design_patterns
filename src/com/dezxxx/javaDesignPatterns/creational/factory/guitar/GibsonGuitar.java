package com.dezxxx.javaDesignPatterns.creational.factory.guitar;

import com.dezxxx.javaDesignPatterns.creational.factory.Guitar;

public class GibsonGuitar implements Guitar {
    @Override
    public void playGuitar() {
        System.out.println("Gibson guitar ready to play....");
    }
}
