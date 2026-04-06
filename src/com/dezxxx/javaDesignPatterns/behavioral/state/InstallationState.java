package com.dezxxx.javaDesignPatterns.behavioral.state;

public interface InstallationState {
    void start(Installer installer);
    void nextStep(Installer installer);
    String getStateName();
}