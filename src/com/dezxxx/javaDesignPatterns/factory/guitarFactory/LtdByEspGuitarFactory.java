package com.dezxxx.javaDesignPatterns.factory.guitarFactory;

import com.dezxxx.javaDesignPatterns.factory.Guitar;
import com.dezxxx.javaDesignPatterns.factory.GuitarFactory;
import com.dezxxx.javaDesignPatterns.factory.guitar.LtdByEspGuitar;

public class LtdByEspGuitarFactory implements GuitarFactory {
    @Override
    public Guitar createGuitar() {
        return new LtdByEspGuitar();
    }
}
