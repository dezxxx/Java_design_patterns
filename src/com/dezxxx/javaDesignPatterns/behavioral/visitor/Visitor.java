package com.dezxxx.javaDesignPatterns.behavioral.visitor;

interface Visitor {
    void visit(PrepareStep step);
    void visit(InstallFilesStep step);
    void visit(FinishStep step);
}