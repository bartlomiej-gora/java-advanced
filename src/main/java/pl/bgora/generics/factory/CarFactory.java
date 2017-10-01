package pl.bgora.generics.factory;

import pl.bgora.generics.model.AbstractVehicle;

public interface CarFactory<T> {

    T produce(String model, String color);
}
