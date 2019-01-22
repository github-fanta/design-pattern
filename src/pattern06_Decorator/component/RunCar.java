package pattern06_Decorator.component;

public class RunCar implements Car {
    @Override
    public void run() {
        System.out.println("车在跑");
    }
}
