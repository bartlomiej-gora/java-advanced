package pl.bgora.generics.model;

public class Locomotive extends AbstractVehicle {

    private long tonage;

    public void move() {
        System.out.println("Driving a Locomitive!!!..... pooh pooh!");
    }

    public long getTonage() {
        return tonage;
    }

    public void setTonage(long tonage) {
        this.tonage = tonage;
    }
}
