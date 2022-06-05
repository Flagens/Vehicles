package com.company.classes.vehicles.onWheels;

import com.company.classes.engines.ElectricEngine;
import com.company.classes.enums.Color;
import com.company.classes.interfaces.interfaceCar;
import com.company.classes.prototypes.EngineVehicle;

public class Tram extends EngineVehicle implements interfaceCar {
    public Tram(Integer price, Color colour, String vehicleName, Integer maxSpeed, ElectricEngine engine) {
        super(price, colour, vehicleName, maxSpeed, engine);
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Jezdze z predkoscia" + velocity);
    }
}
