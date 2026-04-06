package com.dezxxx.javaDesignPatterns.behavioral.mediator;

public class PassengerPlane extends Airplane {

    public PassengerPlane(AirTrafficControl control, String name) {
        super(control, name);
    }

    @Override
    public void requestTakeOff() {
        control.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        control.requestLanding(this);
    }
}