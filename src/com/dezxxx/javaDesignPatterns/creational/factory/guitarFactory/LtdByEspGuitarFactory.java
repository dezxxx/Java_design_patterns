package com.dezxxx.javaDesignPatterns.creational.factory.guitarFactory;

import com.dezxxx.javaDesignPatterns.creational.factory.Guitar;
import com.dezxxx.javaDesignPatterns.creational.factory.GuitarFactory;
import com.dezxxx.javaDesignPatterns.creational.factory.guitar.LtdByEspGuitar;

public class LtdByEspGuitarFactory implements GuitarFactory {
    @Override
    public Guitar createGuitar() {
        return new LtdByEspGuitar();
    }
}
