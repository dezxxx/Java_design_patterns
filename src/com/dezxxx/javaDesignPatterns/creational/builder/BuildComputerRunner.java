package com.dezxxx.javaDesignPatterns.creational.builder;

import com.dezxxx.javaDesignPatterns.creational.builder.impl.GamingComputerBuilder;
import com.dezxxx.javaDesignPatterns.creational.builder.impl.OfficeComputerBuilder;
import com.dezxxx.javaDesignPatterns.creational.builder.impl.ProgramingComputerBuilder;
import com.dezxxx.javaDesignPatterns.creational.builder.model.Computer;

public class BuildComputerRunner {
    public static void main(String[] args) {

        Director director = new Director();


        director.setBuilder(new GamingComputerBuilder());
        Computer computer1 = director.buildComputer();
        System.out.println(computer1);

        System.out.println("----------------");
        director.setBuilder(new OfficeComputerBuilder());
        Computer computer2 = director.buildComputer();
        System.out.println(computer2);

        System.out.println("----------------");
        director.setBuilder(new ProgramingComputerBuilder());
        Computer computer3 = director.buildComputer();
        System.out.println(computer3);


    }
}
