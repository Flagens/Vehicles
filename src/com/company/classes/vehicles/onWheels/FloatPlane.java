package com.company.classes.vehicles.onWheels;

import com.company.classes.engines.CombustionEngine;
import com.company.classes.enums.Color;
import com.company.classes.interfaces.interfacePlane;
import com.company.classes.interfaces.interfaceSship;
import com.company.classes.prototypes.FlyingVehicle;

public class FloatPlane extends FlyingVehicle implements interfaceSship, interfacePlane {

    public FloatPlane(Integer price, Color colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity, maxHeight);
    }

    @Override
    public void swim(int velocity) {
        System.out.println("Umiem plywac z predkopscia " + velocity);
    }

    @Override
    public void fly(int velocity, int height) {
        System.out.println("Umiem latac z predkoscia " + velocity + " na wysokosc " + height + " m");
    }

    @Override
    public void land() {
        System.out.println("laduje");
    }
}
