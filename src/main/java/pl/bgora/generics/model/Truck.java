package pl.bgora.generics.model;

public class Truck extends AbstractVehicle {

    private int wheelCount;
    private String color;

    @Override
    public void move() {
        System.out.println("Driving a truck colored..." + color);
        System.out.println("name: " + name);
        System.out.println("wheels: " + wheelCount);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
}
