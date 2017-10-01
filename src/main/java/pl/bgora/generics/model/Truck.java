package pl.bgora.generics.model;

public class Truck extends AbstractVehicle {

    private int wheelCount;


    @Override
    public void move() {
        System.out.println("Driving a truck...");
        System.out.println("name: " + name);
        System.out.println("wheels: " + wheelCount);
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
