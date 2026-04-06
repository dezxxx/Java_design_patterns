package com.dezxxx.javaDesignPatterns.behavioral.visitor;

class LoggingVisitor implements Visitor {

    @Override
    public void visit(PrepareStep step) {
        System.out.println("Preparing system...");
    }

    @Override
    public void visit(InstallFilesStep step) {
        System.out.println("Installing files...");
    }

    @Override
    public void visit(FinishStep step) {
        System.out.println("Finishing installation...");
    }
}