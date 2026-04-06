package com.dezxxx.javaDesignPatterns.behavioral.mediator;

import java.util.LinkedList;
import java.util.Queue;

public class AirportControlTower implements AirTrafficControl {

    private boolean runwayFree = true;
    private final Queue<Airplane> queue = new LinkedList<>();

    @Override
    public void requestTakeOff(Airplane airplane) {
        if (runwayFree) {
            runwayFree = false;
            System.out.println(airplane.getName() + " is taking off");
            runwayFree = true;
        } else {
            System.out.println(airplane.getName() + " waiting for takeoff");
            queue.add(airplane);
        }
    }

    @Override
    public void requestLanding(Airplane airplane) {
        if (runwayFree) {
            runwayFree = false;
            System.out.println(airplane.getName() + " is landing");
            runwayFree = true;
        } else {
            System.out.println(airplane.getName() + " waiting for landing");
            queue.add(airplane);
        }
    }


}