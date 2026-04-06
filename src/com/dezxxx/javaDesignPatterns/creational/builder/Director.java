package com.dezxxx.javaDesignPatterns.creational.builder;

import com.dezxxx.javaDesignPatterns.creational.builder.model.Computer;

public class Director {
    ComputerBuilder builder;

    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }

    Computer buildComputer() {
       builder.createComputer();
       builder.buildName();
       builder.buildCpu();
       builder.buildRam();
       builder.buildStorage();
       builder.buildGpu();
       builder.buildPrice();

       Computer computer = builder.getComputer();
       return computer;
    }


}
