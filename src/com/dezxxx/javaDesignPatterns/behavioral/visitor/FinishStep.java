package com.dezxxx.javaDesignPatterns.behavioral.visitor;

class FinishStep implements InstallationStep {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
