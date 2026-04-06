package com.dezxxx.javaDesignPatterns.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class StartUpDevFactorySupplier {



        private static final Map<String, StartUpDeveloper> developers = new HashMap<>();
        private static final Map<String, Supplier<StartUpDeveloper>> creators = new HashMap<>();

        static {
            creators.put("frontend", () -> {
                System.out.println("Frontend developer is created");
                return new FrontendStartUpDeveloper();
            });

            creators.put("backend", () -> {
                System.out.println("Backend developer is created");
                return new BackendStartUpDeveloper();
            });
        }

        public static StartUpDeveloper getDeveloperByType(String type) {

            return developers.computeIfAbsent(type, key -> {
                Supplier<StartUpDeveloper> creator = creators.get(key);

                if (creator == null) {
                    throw new IllegalArgumentException("Unknown developer type: " + key);
                }

                return creator.get();
            });
        }
    }

