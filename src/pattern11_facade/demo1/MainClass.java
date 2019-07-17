package pattern11_facade.demo1;

/**
 * 外观模式
 */
public class MainClass {
    public static void main(String[] args) {
        // 没有外观模式以前 想要用三个系统
        SystemA systemA = new SystemA();
        systemA.doSomething();
        SystemB systemB = new SystemB();
        systemB.doSomething();
        SystemC systemC = new SystemC();
        systemC.doSomething();

        // 有了外观模式以后只需要看外观提供的服务就行了
        Facade facade = new Facade();
        facade.doAB();

    }
}
