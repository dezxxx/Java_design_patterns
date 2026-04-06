package com.dezxxx.javaDesignPatterns.behavioral.template;

public class InstallerRunner {
    public static void main(String[] args) {

        InstallerTemplate installer = new WindowsInstaller();
        installer.installSystem();

        System.out.println();

        installer = new LinuxInstaller();
        installer.installSystem();
    }
}