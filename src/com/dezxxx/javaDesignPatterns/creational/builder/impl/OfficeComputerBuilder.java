package com.dezxxx.javaDesignPatterns.creational.builder.impl;

import com.dezxxx.javaDesignPatterns.creational.builder.ComputerBuilder;
import com.dezxxx.javaDesignPatterns.creational.builder.model.CpuGpuType;

public class OfficeComputerBuilder extends ComputerBuilder {
    @Override
    public   void buildName() {
    computer.setName("Office Computer");
    }

    @Override
    public   void buildCpu() {
    computer.setCpu(CpuGpuType.INTEL);
    }

    @Override
    public void buildRam() {
    computer.setRam(16);
    }

    @Override
    public void buildStorage() {
    computer.setStorage(2);
    }

    @Override
    public void buildGpu() {
    computer.setGpu(CpuGpuType.NVIDIA);
    }

    @Override
    public void buildPrice() {
    computer.setPrice(2000);
    }
}
