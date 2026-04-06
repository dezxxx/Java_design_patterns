package com.dezxxx.javaDesignPatterns.behavioral.visitor;

interface InstallationStep {
    void accept(Visitor visitor);
}