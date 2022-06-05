package com.company.classes.vehicles.onWheels;

import com.company.classes.engines.CombustionEngine;
import com.company.classes.enums.Color;
import com.company.classes.interfaces.interfaceCar;
import com.company.classes.prototypes.CombustionEngineVehicle;

// implementacja interfejsu
public class Bulldozer extends CombustionEngineVehicle implements interfaceCar {
    public Bulldozer(Integer price, Color colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity);
    }

    public void dig(){
        System.out.println("Umiem kopac");
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Jezdze z predkoscia " + velocity);
    }
}
