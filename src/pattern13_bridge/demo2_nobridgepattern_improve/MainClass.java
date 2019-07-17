package pattern13_bridge.demo2_nobridgepattern_improve;

public class MainClass {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.install2200Engine();
        bus.install2400Engine(); // 要是bus根本不能有2400cc的引擎怎么办?
    }
}
