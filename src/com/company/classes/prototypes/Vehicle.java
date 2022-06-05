package com.company.classes.prototypes;

import com.company.classes.MyObject;
import com.company.classes.engines.Drive;
import com.company.classes.enums.Color;
//dziedziczenie
public abstract class Vehicle extends MyObject {
    private Color colour;
    private String vehicleName;
    private Integer maxSpeed;
    private Drive drive;

    public Vehicle(Integer price, Color colour, String vehicleName, Integer maxSpeed, Drive drive) {
        super(price);
        this.colour = colour;
        this.vehicleName = vehicleName;
        this.maxSpeed = maxSpeed;
        this.drive = drive;
    }

    //gettery i settery - enkapsulacja
    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    //dynamiczny polimorfizm

    @Override
    public void buy(String price){
        System.out.println("Kupuje " + getClassName() + " " + this.vehicleName + ", za " + price);
    }

    @Override
    public void sell(String price){
        System.out.println("Sprzedaje " + getClassName() + " " + this.vehicleName + ", za " + price);
    }

    public void printCarName(){
        System.out.println(vehicleName);
    }
}
