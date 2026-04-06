package com.dezxxx.javaDesignPatterns.behavioral.mediator;

public interface AirTrafficControl {
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
