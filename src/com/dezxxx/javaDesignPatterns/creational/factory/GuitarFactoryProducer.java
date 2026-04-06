package com.dezxxx.javaDesignPatterns.creational.factory;

import com.dezxxx.javaDesignPatterns.creational.factory.guitarFactory.GibsonGuitarFactory;
import com.dezxxx.javaDesignPatterns.creational.factory.guitarFactory.IbanezGuitarFactory;
import com.dezxxx.javaDesignPatterns.creational.factory.guitarFactory.LtdByEspGuitarFactory;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class GuitarFactoryProducer {

    private GuitarFactoryProducer() {
    }

    private static final Map<GuitarsBrand, GuitarFactory> FACTORIES = Map.of(
            GuitarsBrand.IBANEZ, new IbanezGuitarFactory(),
            GuitarsBrand.GIBSON, new GibsonGuitarFactory(),
            GuitarsBrand.LTD_BY_ESP, new LtdByEspGuitarFactory()
    );

    private static final Map<String, GuitarsBrand> BRANDS_BY_NAME =
            Stream.of(GuitarsBrand.values())
                    .collect(Collectors.toMap(
                            brand -> brand.getBrandName().toLowerCase(),
                            Function.identity()
                    ));

    public static GuitarFactory createGuitarByBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            throw new IllegalArgumentException("Brand cannot be null or blank");
        }

        GuitarsBrand guitarBrand = BRANDS_BY_NAME.get(brand.trim().toLowerCase());

        if (guitarBrand == null) {
            throw new IllegalArgumentException(brand + " is unknown guitar brand");
        }

        return FACTORIES.get(guitarBrand);
    }
}