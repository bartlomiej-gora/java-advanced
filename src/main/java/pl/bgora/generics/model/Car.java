package pl.bgora.generics.model;

public class Car extends AbstractVehicle {

    private int wheelCount;
    private int seatsCount;
    private int doorsCount;
    private String model;
    private String color;


    @Override
    public void move() {
        System.out.println("Driving a car..." + color);
        System.out.println("name: " + name);
        System.out.println("wheels: " + wheelCount);
        System.out.println("seats: " + seatsCount);
        System.out.println("doors: " + doorsCount);
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public void setSeatsCount(int seatsCount) {
        this.seatsCount = seatsCount;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
