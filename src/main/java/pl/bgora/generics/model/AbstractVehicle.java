package pl.bgora.generics.model;

public abstract class AbstractVehicle {

    protected AbstractEngine engine;

    protected String name;


    public AbstractEngine getEngine() {
        return engine;
    }

    public void setEngine(AbstractEngine engine) {
        this.engine = engine;
    }

    public abstract void move();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
