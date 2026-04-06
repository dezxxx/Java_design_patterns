package com.dezxxx.javaDesignPatterns.structural.Flyweight;


import java.util.HashMap;
import java.util.Map;

public class StartUpDeveloperFactory {

    private static final Map<String, StartUpDeveloper> developers = new HashMap<>();

    public static StartUpDeveloper getDeveloperByType (String type) {
        StartUpDeveloper startUpDeveloper =  developers.get(type);
        if (startUpDeveloper == null) {
            switch (type) {
                case "frontend":
                    System.out.println("Frontend developer is Created");
                    startUpDeveloper = new FrontendStartUpDeveloper();
                    break;

                    case "backend":
                    System.out.println("Backend developer is Created");
                    startUpDeveloper = new BackendStartUpDeveloper();
                    break;

                default:
                    throw new IllegalArgumentException("Unknown developer type: " + type);

            }

        } developers.put(type, startUpDeveloper);

        return startUpDeveloper;

    }
}