package com.dezxxx.javaDesignPatterns.factory.guitar;

import com.dezxxx.javaDesignPatterns.factory.Guitar;

public class GibsonGuitar implements Guitar {
    @Override
    public void playGuitar() {
        System.out.println("Gibson guitar ready to play....");
    }
}
