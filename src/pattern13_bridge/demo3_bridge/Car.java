package pattern13_bridge.demo3_bridge;

public abstract class Car {
    protected Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public abstract void installEngine();
}
