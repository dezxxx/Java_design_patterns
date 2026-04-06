package com.dezxxx.javaDesignPatterns.structural.facade;

public class ComputerFacade {

        private final CPU cpu = new CPU();
        private final Memory memory = new Memory();
        private final HardDrive hardDrive = new HardDrive();

       public void startComputer() {
            cpu.start();
            memory.load();
            hardDrive.read();
            System.out.println("Computer started");
        }
    }

