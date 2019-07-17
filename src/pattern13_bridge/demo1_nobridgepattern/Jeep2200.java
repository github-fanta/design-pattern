package pattern13_bridge.demo1_nobridgepattern;

public class Jeep2200 extends Jeep{
    @Override
    public void installEngine() {
        System.out.println("为Jeep安装2200cc发动机");
    }
}
