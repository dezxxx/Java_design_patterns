package com.dezxxx.javaDesignPatterns.creational.builder.impl;

import com.dezxxx.javaDesignPatterns.creational.builder.ComputerBuilder;
import com.dezxxx.javaDesignPatterns.creational.builder.model.CpuGpuType;

public class GamingComputerBuilder extends ComputerBuilder {


    @Override
  public void buildName() {
    computer.setName("Gaming Computer");
    }

    @Override
    public void buildCpu() {
        computer.setCpu(CpuGpuType.AMD);
    }
    @Override
    public void buildRam() {
    computer.setRam(64);
    }

    @Override
    public void buildStorage() {
        computer.setStorage(4);
    }

    @Override
    public void buildGpu() {
        computer.setGpu(CpuGpuType.RADEON);
    }

    @Override
   public void buildPrice() {
    computer.setPrice(5000);
    }
}
