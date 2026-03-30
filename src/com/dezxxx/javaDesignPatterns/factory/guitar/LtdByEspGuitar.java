package com.dezxxx.javaDesignPatterns.factory.guitar;

import com.dezxxx.javaDesignPatterns.factory.Guitar;

public class LtdByEspGuitar implements Guitar {
    @Override
    public void playGuitar() {
        System.out.println("LTD by ESP guitar ready to play.....");
    }
}
