package pattern17_chainOfResponsibility;

public abstract class CarHandler {
    protected CarHandler carHandler;
    public CarHandler setCarHandler(CarHandler carHandler) {
        this.carHandler = carHandler;
        return carHandler;
    }
    public abstract void handle();
}
