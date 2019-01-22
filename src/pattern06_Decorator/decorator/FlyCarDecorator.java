package pattern06_Decorator.decorator;

import pattern06_Decorator.component.Car;

/**
 * 飞翔装饰器
 */
public class FlyCarDecorator extends CarDecorator {

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {
        // 先执行这个car本身的run方法
        this.getCar().run();
        // 再对它进行补充
        fly();
    }

    private void fly() {
        System.out.println("车在飞");
    }
}
