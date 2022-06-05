package com.company.classes.prototypes;

import com.company.classes.engines.CombustionEngine;
import com.company.classes.enums.Color;


public abstract class CombustionEngineVehicle extends EngineVehicle{
    private int tankCapacity;

    public CombustionEngineVehicle(Integer price, Color colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity) {
        super(price, colour, vehicleName, maxSpeed, engine);
        this.tankCapacity = tankCapacity;
    }

    public void launchEngine(){
        System.out.println("Uruchamiam silnik " + getVehicleName());
    }


    @Override
    public CombustionEngine getDrive(){
        return (CombustionEngine) super.getDrive();
    }
}