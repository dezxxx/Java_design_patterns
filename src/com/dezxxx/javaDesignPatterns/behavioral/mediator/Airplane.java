package com.dezxxx.javaDesignPatterns.behavioral.mediator;

public abstract class Airplane {

    protected AirTrafficControl control;
    protected String name;

    public Airplane(AirTrafficControl control, String name) {
        this.control = control;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void requestTakeOff();
    public abstract void requestLanding();
}