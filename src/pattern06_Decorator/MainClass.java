package pattern06_Decorator;

import pattern06_Decorator.component.RunCar;
import pattern06_Decorator.decorator.FlyCarDecorator;
import pattern06_Decorator.decorator.SwimCarDecorator;
/**
 * 1）之前如果要产生不同的车可以通过编写新的类，扩展一般的类，实现新的功能，来生产不同功能一起的车（能跑的车，能跑和飞的车，能跑、飞和游的车，能游和跑的车）
 *   代码没有得到复用。类的种类繁多。
 * 2）使用装饰器模式后，可以通过不同的装饰器为原始类添加不同的功能。
 * 3）装饰器也实现原始类的接口，可以将装饰器当成原始类，传到另一个装饰器中。
 * Java 流中很常见
 * 其实是把增强的功能(变化)抽出来，可以编写。但是可以复用旧的功能。
 * 和模板模式的区别在于，在子类中依旧可按照自己的意愿随意编写执行顺序，而不是只复写模板抽象类中的钩子函数。
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("--------没有装饰-------");
        RunCar car = new RunCar();
        car.run();

        System.out.println("--------采用飞翔装饰器后-------");
        FlyCarDecorator flyCar = new FlyCarDecorator(car);
        flyCar.run();

        System.out.println("--------再采用游泳装饰器后-------");
        // 这就是装饰器实现Car接口的原因——能够链式继续采用多个装饰器
        SwimCarDecorator swimFlyCar = new SwimCarDecorator(flyCar);
        swimFlyCar.run();

    }
}
