package com.dezxxx.javaDesignPatterns.factory.guitarFactory;

import com.dezxxx.javaDesignPatterns.factory.Guitar;
import com.dezxxx.javaDesignPatterns.factory.GuitarFactory;
import com.dezxxx.javaDesignPatterns.factory.guitar.GibsonGuitar;

public class GibsonGuitarFactory implements GuitarFactory {
    @Override
    public Guitar createGuitar() {
        return new GibsonGuitar();
    }
}
