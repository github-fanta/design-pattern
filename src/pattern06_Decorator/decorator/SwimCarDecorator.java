package pattern06_Decorator.decorator;

import pattern06_Decorator.component.Car;

/*
 * 游泳装饰器
 */
public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        this.getCar().run();
        swim();
    }

    private void swim() {
        System.out.println("车在游");
    }

}
