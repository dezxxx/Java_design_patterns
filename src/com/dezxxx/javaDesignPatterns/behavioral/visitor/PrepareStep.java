package com.dezxxx.javaDesignPatterns.behavioral.visitor;

class PrepareStep implements InstallationStep {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

