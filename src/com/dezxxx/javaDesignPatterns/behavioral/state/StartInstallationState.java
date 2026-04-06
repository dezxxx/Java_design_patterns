package com.dezxxx.javaDesignPatterns.behavioral.state;

public class StartInstallationState implements InstallationState {

    @Override
    public void start(Installer installer) {
        System.out.println("Installation started...");
        installer.setState(new InProgressInstallationState());
    }

    @Override
    public void nextStep(Installer installer) {
        System.out.println("Installation has not started yet.");
    }

    @Override
    public String getStateName() {
        return "START";
    }
}