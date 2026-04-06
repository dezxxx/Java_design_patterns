package com.dezxxx.javaDesignPatterns.behavioral.visitor;

public class Runner {
    public static void main(String[] args) {

        InstallationStep[] steps = {
                new PrepareStep(),
                new InstallFilesStep(),
                new FinishStep()
        };

        Visitor visitor = new LoggingVisitor();

        for (InstallationStep step : steps) {
            step.accept(visitor);
        }
    }
}