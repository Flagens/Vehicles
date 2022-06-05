package com.company;

import com.company.classes.MyObject;
import com.company.classes.engines.BicycleDrive;
import com.company.classes.engines.CombustionEngine;
import com.company.classes.engines.ElectricEngine;
import com.company.classes.interfaces.interfaceCar;
import com.company.classes.interfaces.interfacePlane;
import com.company.classes.interfaces.interfaceSship;
import com.company.classes.prototypes.CombustionEngineVehicle;
import com.company.classes.prototypes.EngineVehicle;
import com.company.classes.prototypes.FlyingVehicle;
import com.company.classes.prototypes.Vehicle;
import com.company.classes.vehicles.onWheels.*;

import java.util.ArrayList;

import static com.company.classes.enums.Color.*;

public class Main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(16000, RED, "sedan", 100, new CombustionEngine(2), 100);
        Bus bus1 = new Bus(11000, BLUE, "bus", 50, new CombustionEngine(4), 1000);
        Tram tram1 = new Tram(900000, MAGENTA, "tram", 32, new ElectricEngine());
        DeliveryVan deliveryVan1 = new DeliveryVan(170000, YELLOW, "delivery van", 150, new CombustionEngine(5), 500);
        FloatPlane floatPlane1 = new FloatPlane(7000000, RED, "float plane", 500, new CombustionEngine(5), 1000, 1000);
        JetFighter jetFighter1 = new JetFighter(2000000, GREEN, "jet plane", 2000, new CombustionEngine(9), 1200, 4000);
        Bulldozer bulldozer1 = new Bulldozer( 900000, RED, "bulldozer", 13, new CombustionEngine(10), 800);
        Motobike motobike1 = new Motobike(70000, PINK, "motobike", 190, new CombustionEngine(1), 140);
        Bicycle bicycle1 = new Bicycle(300, PINK, "bike", 20, new BicycleDrive());
        Helicopter helicopter1 = new Helicopter(2550000, YELLOW, "helicopter", 490, new CombustionEngine(25), 3000, 900);
        CarAmphibia carAmfibia1 = new CarAmphibia(700000, PURPLE, "car amphibia", 200, new CombustionEngine(3), 600);
        CombustionEngine combustionEngine1 = new CombustionEngine(4);
        ElectricEngine electricEngine1 = new ElectricEngine();
        BicycleDrive bicycleDrive1 = new BicycleDrive();


        Object[] arr1 = new Object[]{
                sedan1, bus1, tram1, deliveryVan1, floatPlane1, jetFighter1, bulldozer1, motobike1, bicycle1, helicopter1, carAmfibia1, combustionEngine1,
                electricEngine1, bicycleDrive1 };
        ArrayList<EngineVehicle> arrayList2 = new ArrayList<>();
        ArrayList<interfaceCar> arrayList3 = new ArrayList<>();
        ArrayList<interfacePlane> arrayList4 = new ArrayList<>();
        ArrayList<interfaceSship> arrayList5 = new ArrayList<>();
        ArrayList<CombustionEngineVehicle> arrayList6 = new ArrayList<>();

        for(Object currentObject : arr1){
            if(currentObject instanceof Vehicle currentVehicle){
                if(currentVehicle instanceof EngineVehicle)
                    arrayList2.add((EngineVehicle) currentVehicle);
                if(currentVehicle instanceof interfaceCar)
                    arrayList3.add((interfaceCar) currentVehicle);
                if(currentVehicle instanceof interfacePlane)
                    arrayList4.add((interfacePlane) currentVehicle);
                if(currentVehicle instanceof interfaceSship)
                    arrayList5.add((interfaceSship) currentVehicle);
                if(currentVehicle instanceof CombustionEngineVehicle)
                    arrayList6.add((CombustionEngineVehicle) currentVehicle);
            }
        }

        EngineVehicle[] arr2 = arrayList2.toArray(new EngineVehicle[0]);
        interfaceCar[] arr3 = arrayList3.toArray(new interfaceCar[0]);
        interfacePlane[] arr4 = arrayList4.toArray(new interfacePlane[0]);
        interfaceSship[] arr5 = arrayList5.toArray(new interfaceSship[0]);
        CombustionEngineVehicle[] arr6 = arrayList6.toArray(new CombustionEngineVehicle[0]);
        Bulldozer[] arr7 = new Bulldozer[]{bulldozer1};

        System.out.println(" ");
        System.out.println("1 tablica");

        for(Object currentObject : arr1){
            if(currentObject instanceof MyObject currentMyObject){
                currentMyObject.buy(currentMyObject.getPrice().toString());
                currentMyObject.printParentClassName();
                if(currentMyObject instanceof Vehicle currentVehicle)
                    currentVehicle.printCarName();
                currentMyObject.buy(currentMyObject.getPrice().toString());
                currentMyObject.sell(currentMyObject.getPrice().toString());
            }
        }
        System.out.println(" ");
        System.out.println("2 tablica");

        for(EngineVehicle currentEngineVehicle : arr2){
            currentEngineVehicle.buy(currentEngineVehicle.getPrice().toString());
            if(currentEngineVehicle instanceof CombustionEngineVehicle currentCombustionEngineVehicle)
                currentCombustionEngineVehicle.launchEngine();
        }
        System.out.println(" ");
        System.out.println("3 tablica");

        for(interfaceCar currentTerrestrial : arr3){
            if(currentTerrestrial instanceof MyObject currentMyObject)
                currentMyObject.buy(currentMyObject.getPrice().toString());
            if(currentTerrestrial instanceof Vehicle currentVehicle)
                currentTerrestrial.drive(currentVehicle.getMaxSpeed());
        }
        System.out.println(" ");
        System.out.println("4 tablica");

        int i = 0;
        while (i < arr4.length){
            interfacePlane currentAerial = arr4[i];
            if(currentAerial instanceof MyObject currentMyObject)
                currentMyObject.buy(currentMyObject.getPrice().toString());
            if(currentAerial instanceof FlyingVehicle currentFlyingVehicle)
                currentAerial.fly(currentFlyingVehicle.getMaxSpeed(), currentFlyingVehicle.getMaxHeight());
            currentAerial.land();
            i++;
        }
        System.out.println(" ");
        System.out.println("5 tablica");

        i = 0;
        while (i < arr5.length){
            interfaceSship currentAquatic = arr5[i];
            if(currentAquatic instanceof MyObject currentMyObject)
                currentMyObject.buy(currentMyObject.getPrice().toString());
            if(currentAquatic instanceof Vehicle currentVehicle)
                currentAquatic.swim(currentVehicle.getMaxSpeed());
            i++;
        }
        System.out.println(" ");
        System.out.println("6 tablica");

        i = 0;
        while (i < arr6.length){
            CombustionEngineVehicle currentCombustionEngineVehicle = arr6[i];
            currentCombustionEngineVehicle.buy(currentCombustionEngineVehicle.getPrice().toString());
            currentCombustionEngineVehicle.refuel(currentCombustionEngineVehicle.getDrive().getEngineCapacity());
            i++;
        }
        System.out.println(" ");
        System.out.println("7 tablica");

        i = 0;
        while (i < arr7.length){
            Bulldozer currentBulldozer = arr7[i];
            currentBulldozer.buy(currentBulldozer.getPrice().toString());
            currentBulldozer.dig();
            i++;
        }
    }
}