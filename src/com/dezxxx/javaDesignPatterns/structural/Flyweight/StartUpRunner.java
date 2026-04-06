package com.dezxxx.javaDesignPatterns.structural.Flyweight;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class StartUpRunner {
    public static void main(String[] args) {
        StartUpDeveloperFactory factory = new StartUpDeveloperFactory();
        List<StartUpDeveloper> developers = new ArrayList<>();


        developers.add(StartUpDevFactorySupplier.getDeveloperByType("backend"));
        developers.add(StartUpDevFactorySupplier.getDeveloperByType("backend"));
        developers.add(StartUpDevFactorySupplier.getDeveloperByType("backend"));
        developers.add(StartUpDevFactorySupplier.getDeveloperByType("backend"));

        developers.add(StartUpDeveloperFactory.getDeveloperByType("frontend"));
        developers.add(StartUpDeveloperFactory.getDeveloperByType("frontend"));
        developers.add(StartUpDeveloperFactory.getDeveloperByType("frontend"));
        developers.add(StartUpDeveloperFactory.getDeveloperByType("frontend"));

        for (StartUpDeveloper developer : developers) {
            developer.develop("StartUp");
        }
    }


}

