package com.dezxxx.javaDesignPatterns.factory;

import com.dezxxx.javaDesignPatterns.factory.guitarFactory.LtdByEspGuitarFactory;
import com.dezxxx.javaDesignPatterns.factory.guitarFactory.GibsonGuitarFactory;
import com.dezxxx.javaDesignPatterns.factory.guitarFactory.IbanezGuitarFactory;

public class GuitarPlayApp {
    public static void main(String[] args) {
        GuitarFactory ltdByEspFactory = createGuitarByBrand("LTD by ESP");
        Guitar ltdByEsp = ltdByEspFactory.createGuitar();
        ltdByEsp.playGuitar();

        GuitarFactory ibanezFactory = createGuitarByBrand("Ibanez");
        Guitar ibanez = ibanezFactory.createGuitar();
        ibanez.playGuitar();
    }

    static GuitarFactory createGuitarByBrand(String brand) {
        if(brand.equalsIgnoreCase("Ibanez")) {
            return new IbanezGuitarFactory();
        }else if (brand.equalsIgnoreCase("Gibson")) {
            return new GibsonGuitarFactory();
        } else if (brand.equalsIgnoreCase("LTD by ESP")) {
            return new LtdByEspGuitarFactory();
        } else {
            throw new IllegalArgumentException(brand + " is unknown guitar brand");
        }
    }
}
