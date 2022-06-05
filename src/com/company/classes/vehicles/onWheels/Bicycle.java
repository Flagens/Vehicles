package com.company.classes.vehicles.onWheels;

import com.company.classes.engines.BicycleDrive;
import com.company.classes.enums.Color;
import com.company.classes.interfaces.interfaceCar;
import com.company.classes.prototypes.Vehicle;
//dziedziczenie i implementacja interfacu
public class Bicycle extends Vehicle implements interfaceCar {
    public Bicycle(Integer price, Color colour, String vehicleName, Integer maxSpeed, BicycleDrive drive) {
        super(price, colour, vehicleName, maxSpeed, drive);
    }

    @Override
    public void drive(int velocity) {
        System.out.println("Jezdze z predkoscia" + velocity);
    }
}
