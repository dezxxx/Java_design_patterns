package com.dezxxx.javaDesignPatterns.factory;

import com.dezxxx.javaDesignPatterns.factory.guitarFactory.GibsonGuitarFactory;
import com.dezxxx.javaDesignPatterns.factory.guitarFactory.IbanezGuitarFactory;
import com.dezxxx.javaDesignPatterns.factory.guitarFactory.LtdByEspGuitarFactory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuitarPlayApp {

    public static void main(String[] args) {

        // RU: Создаём фабрику для LTD by ESP
        // EN: Create factory for LTD by ESP
        GuitarFactory ltdByEspFactory = GuitarFactoryProducer.createGuitarByBrand(("LTD by ESP"));
        Guitar ltdByEsp = ltdByEspFactory.createGuitar();
        ltdByEsp.playGuitar();

        System.out.println("-----");

        // RU: Создаём фабрику для Ibanez
        // EN: Create factory for Ibanez
        GuitarFactory ibanezFactory = GuitarFactoryProducer.createGuitarByBrand("Ibanez");
        Guitar ibanez = ibanezFactory.createGuitar();
        ibanez.playGuitar();

        System.out.println("-----");

        // RU: Создаём фабрику для Gibson
        // EN: Create factory for Gibson
        GuitarFactory gibsonFactory = GuitarFactoryProducer.createGuitarByBrand("Gibson");
        Guitar gibson = gibsonFactory.createGuitar();
        gibson.playGuitar();

        System.out.println("-----");

        // RU: Пример со Stream
        // EN: Example with Stream
        List<String> brands = List.of("Ibanez", "Gibson", "LTD by ESP");

        brands.stream()
                .map(GuitarFactoryProducer::createGuitarByBrand)
                .map(GuitarFactory::createGuitar)
                .forEach(Guitar::playGuitar);
    }


}