package com.dezxxx.javaDesignPatterns.behavioral.state;

public class Runner {
    public static void main(String[] args) {
        Installer installer = new Installer();

        System.out.println("Initial state: " + installer.getCurrentState());
        System.out.println();

        installer.startInstallation();
        System.out.println();

        installer.nextStep();
        System.out.println();

        installer.nextStep();
        System.out.println();

        installer.startInstallation();
        System.out.println();

        installer.resetInstallation();
        System.out.println();

        installer.startInstallation();
        System.out.println();

        System.out.println("\n===========================================\n");

        installer.resetInstallation();
        System.out.println();
        installer.startInstallation();
        System.out.println();
        installer.nextStep();


    }
}