package pattern13_bridge.demo1_nobridgepattern;

public class Jeep2000 extends Jeep{

    @Override
    public void installEngine() {
        System.out.println("为Jeep安装2000cc发动机");
    }
}
