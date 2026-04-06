package com.dezxxx.javaDesignPatterns.behavioral.state;

public class InProgressInstallationState implements InstallationState {

    @Override
    public void start(Installer installer) {
        System.out.println("Installation is already running.");
    }

    @Override
    public void nextStep(Installer installer) {
        System.out.println("Installation completed!");
        installer.setState(new CompletedInstallationState());
    }

    @Override
    public String getStateName() {
        return "IN_PROGRESS";
    }
}