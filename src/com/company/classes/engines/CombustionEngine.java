package com.company.classes.engines;

public class CombustionEngine implements Engine {
    private int engineCapacity;

    public CombustionEngine() {
    }

    public CombustionEngine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
