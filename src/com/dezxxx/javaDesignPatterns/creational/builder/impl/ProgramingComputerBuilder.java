package com.dezxxx.javaDesignPatterns.creational.builder.impl;

import com.dezxxx.javaDesignPatterns.creational.builder.ComputerBuilder;
import com.dezxxx.javaDesignPatterns.creational.builder.model.CpuGpuType;

public class ProgramingComputerBuilder extends ComputerBuilder {
    @Override
    public void buildName() {
    computer.setName("Programing Computer");
    }

    @Override
    public void buildCpu() {
    computer.setCpu(CpuGpuType.M1);
    }

    @Override
    public void buildRam() {
    computer.setRam(64);
    }

    @Override
    public void buildStorage() {
    computer.setStorage(10);
    }

    @Override
    public void buildGpu() {
    computer.setGpu(CpuGpuType.ARC);
    }

    @Override
    public void buildPrice() {
    computer.setPrice(10000);
    }
}
