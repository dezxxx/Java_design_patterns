package com.dezxxx.javaDesignPatterns.behavioral.mediator;

public class AirportRunner {
    public static void main(String[] args) {

        AirTrafficControl tower = new AirportControlTower();

        Airplane plane1 = new PassengerPlane(tower, "Boeing 737");
        Airplane plane2 = new PassengerPlane(tower, "Airbus A320");
        Airplane plane3 = new PassengerPlane(tower, "Embraer 190");

        plane1.requestTakeOff();
        plane2.requestLanding();
        plane3.requestTakeOff();
    }
}