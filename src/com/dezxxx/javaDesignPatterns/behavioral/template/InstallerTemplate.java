package com.dezxxx.javaDesignPatterns.behavioral.template;

public abstract class InstallerTemplate {
    public final void installSystem(){
        prepare();
        installFiles();
        finish();

    }
    protected abstract void prepare();
    protected abstract void installFiles();
    protected abstract void finish();
}
