package com.dezxxx.javaDesignPatterns.creational.builder;

import com.dezxxx.javaDesignPatterns.creational.builder.model.Computer;

public abstract class ComputerBuilder {
   protected Computer computer;

  void createComputer(){
      computer = new Computer();
  }

 public abstract void buildName();

 public abstract void buildCpu ();

 public abstract void buildRam ();

 public abstract void buildStorage ();

 public abstract void buildGpu();

 public abstract void buildPrice ();

 public Computer getComputer(){
      return computer;
  }
}
