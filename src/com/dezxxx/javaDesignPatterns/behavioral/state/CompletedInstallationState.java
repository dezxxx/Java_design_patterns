package com.dezxxx.javaDesignPatterns.behavioral.state;

public class CompletedInstallationState implements InstallationState {

    @Override
    public void start(Installer installer) {
        System.out.println("Installation is already completed. Reset required.");
    }

    @Override
    public void nextStep(Installer installer) {
        System.out.println("No next step. Installation is already completed.");
    }

    @Override
    public String getStateName() {
        return "COMPLETED";
    }
}