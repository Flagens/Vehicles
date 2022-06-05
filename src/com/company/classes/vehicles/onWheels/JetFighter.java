package com.company.classes.vehicles.onWheels;

import com.company.classes.engines.CombustionEngine;
import com.company.classes.enums.Color;
import com.company.classes.interfaces.interfaceCar;
import com.company.classes.interfaces.interfacePlane;
import com.company.classes.prototypes.FlyingVehicle;

public class JetFighter extends FlyingVehicle implements interfaceCar, interfacePlane {
    private int maxHeight;

    public JetFighter(Integer price, Color colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity, maxHeight);
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Jezdze z predkoscia " + velocity);
    }

    @Override
    public void fly(int velocity, int height) {
        System.out.println("Umiem latac z predkoscia " + velocity + " na wysokosc " + height + " m");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }
}
