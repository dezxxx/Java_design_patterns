package com.dezxxx.javaDesignPatterns.behavioral.visitor;

class InstallFilesStep implements InstallationStep {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
