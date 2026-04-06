package com.dezxxx.javaDesignPatterns.behavioral.template;

public class LinuxInstaller extends InstallerTemplate {

    @Override
    protected void prepare() {
        System.out.println("Checking permissions...");
    }

    @Override
    protected void installFiles() {
        System.out.println("Installing via package manager...");
    }

    @Override
    protected void finish() {
        System.out.println("Updating system paths...");
    }
}
