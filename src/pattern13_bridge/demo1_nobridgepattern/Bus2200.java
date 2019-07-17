package pattern13_bridge.demo1_nobridgepattern;

public class Bus2200 extends Bus {
    @Override
    public void installEngine() {
        System.out.println("为Bus安装2200cc发动机");
    }
}
