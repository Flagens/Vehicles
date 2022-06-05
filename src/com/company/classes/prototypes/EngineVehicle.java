package com.company.classes.prototypes;

import com.company.classes.engines.Drive;
import com.company.classes.enums.Color;

public class EngineVehicle extends Vehicle{
    public EngineVehicle(Integer price, Color colour, String vehicleName, Integer maxSpeed, Drive drive) {
        super(price, colour, vehicleName, maxSpeed, drive);
    }

    public void refuel(int fuelAmount){
        System.out.println("Tankowanie " + fuelAmount + " l");
    }
}
