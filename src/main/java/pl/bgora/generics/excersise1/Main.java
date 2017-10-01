package pl.bgora.generics.excersise1;

import pl.bgora.generics.model.AbstractVehicle;
import pl.bgora.generics.model.Car;
import pl.bgora.generics.model.DieselEngine;
import pl.bgora.generics.model.GasolineEngine;
import pl.bgora.generics.model.Truck;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstractVehicle> vehicles = new LinkedList<AbstractVehicle>();
        Car ford = new Car();

        ford.setName("Ford");
        ford.setDoorsCount(4);
        ford.setSeatsCount(4);
        ford.setWheelCount(4);
        ford.setColor("Red");
        GasolineEngine gasolineEngine = new GasolineEngine();
        gasolineEngine.setGasolineLevel(100);
        gasolineEngine.setEngineOilLevel(100);
        gasolineEngine.setStarted(false);
        ford.setEngine(gasolineEngine);

        vehicles.add(ford);
        Car fiat = new Car();
        fiat.setName("Fiat");
        fiat.setDoorsCount(3);
        fiat.setSeatsCount(4);
        fiat.setWheelCount(4);
        fiat.setColor("Black");
        GasolineEngine gasolineEngineFiat = new GasolineEngine();
        gasolineEngineFiat.setGasolineLevel(100);
        gasolineEngineFiat.setEngineOilLevel(100);
        gasolineEngineFiat.setStarted(false);
        fiat.setEngine(gasolineEngineFiat);
        vehicles.add(fiat);

        DieselEngine dieselEngine = new DieselEngine();
        dieselEngine.setDieselLevel(100);
        dieselEngine.setEngineOilLevel(100);
        dieselEngine.setStarted(false);
        Truck renaultTruck = new Truck();
        renaultTruck.setName("Renault");
        renaultTruck.setWheelCount(18);
        renaultTruck.setEngine(dieselEngine);
        renaultTruck.setColor("Red");

        vehicles.add(renaultTruck);



        //TODO:1  set engines running ang go for all vehicle! :)
//        drive(vehicles);
        //TODO 2: Change the List<AbstractVehicle> vehicles to List<Car> what happens?

        //TODO 3: Pass the List<Car> to drive method, what happens?
    }

    private static void drive() {
        //TODO: add implementation
    }

}
