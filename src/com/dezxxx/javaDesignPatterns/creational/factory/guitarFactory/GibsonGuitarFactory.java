package com.dezxxx.javaDesignPatterns.creational.factory.guitarFactory;

import com.dezxxx.javaDesignPatterns.creational.factory.Guitar;
import com.dezxxx.javaDesignPatterns.creational.factory.GuitarFactory;
import com.dezxxx.javaDesignPatterns.creational.factory.guitar.GibsonGuitar;

public class GibsonGuitarFactory implements GuitarFactory {
    @Override
    public Guitar createGuitar() {
        return new GibsonGuitar();
    }
}
