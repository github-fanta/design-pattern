package pattern01_simplefactory;

/**
 * 简单工厂模式演示
 */
public class MainClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        // 客户端只需要知道 1）工厂在哪里(FruitFactory) 和 2）我要个什么水果(apple/banana)
        // 不需要知道 苹果/香蕉几个步骤怎么做出来的。

        // 方法一：工厂采用简单if else 判断
        Fruit apple = FruitFactory.getFruit("Apple");
        Fruit banana = FruitFactory.getFruit("Banana");
        // 方法二：工厂采用全路径名：
        FruitFactory.getFruit("pattern01_simplefactory.Apple");
        FruitFactory.getFruit("pattern01_simplefactory.Banana");

        apple.get();
        banana.get();
    }
}
