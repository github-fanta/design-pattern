package pattern06_Decorator.decorator;

import pattern06_Decorator.component.Car;

/**
 * 装饰器实现Car是为了在链式装饰时，能够继续满足装饰器的参数要传一个“Car”的要求
 */
public abstract class CarDecorator implements Car{
    // 抽象类只持有一个Car 具体的执行交给
    private Car car;
    public Car getCar(){
        return car;
    }

    public CarDecorator(Car car) {
        this.car = car;
    }

    // 定义抽象方法，把改变交给子类完成
    public abstract void run();
}
