package pl.bgora.generics.factory;

public interface CarFactory<T> {

    T produce(String model, String color);
}
