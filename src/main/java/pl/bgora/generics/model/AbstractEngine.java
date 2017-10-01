package pl.bgora.generics.model;

public abstract class AbstractEngine {

    protected boolean started;
    protected long engineOilLevel;


    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public long getEngineOilLevel() {
        return engineOilLevel;
    }

    public void setEngineOilLevel(long engineOilLevel) {
        this.engineOilLevel = engineOilLevel;
    }
}
