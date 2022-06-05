package com.company.classes.prototypes;

import com.company.classes.engines.CombustionEngine;
import com.company.classes.enums.Color;

public class FlyingVehicle extends CombustionEngineVehicle{
    private int maxHeight;

    public FlyingVehicle(Integer price, Color colour, String vehicleName, Integer maxSpeed, CombustionEngine engine, int tankCapacity, int maxHeight) {
        super(price, colour, vehicleName, maxSpeed, engine, tankCapacity);
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
