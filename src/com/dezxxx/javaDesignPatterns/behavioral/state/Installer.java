package com.dezxxx.javaDesignPatterns.behavioral.state;

public class Installer {

    private InstallationState state;

    public Installer() {
        this.state = new StartInstallationState();
    }

    public void setState(InstallationState state) {
        System.out.println("State changed: " + this.state.getStateName() + " -> " + state.getStateName());
        this.state = state;
    }

    public void startInstallation() {
        System.out.println("Current state: " + state.getStateName());
        state.start(this);
    }

    public void nextStep() {
        System.out.println("Current state: " + state.getStateName());
        state.nextStep(this);
    }

    public void resetInstallation() {
        System.out.println("Installation reset.");
        this.state = new StartInstallationState();
    }

    public String getCurrentState() {
        return state.getStateName();
    }
}