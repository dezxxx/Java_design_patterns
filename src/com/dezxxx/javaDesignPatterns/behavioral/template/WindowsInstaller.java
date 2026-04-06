package com.dezxxx.javaDesignPatterns.behavioral.template;

public class WindowsInstaller extends InstallerTemplate {

    @Override
    protected void prepare() {
        System.out.println("Checking Windows registry...");
    }

    @Override
    protected void installFiles() {
        System.out.println("Copying .exe files...");
    }

    @Override
    protected void finish() {
        System.out.println("Creating desktop shortcut...");
    }
}
