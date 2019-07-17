package pattern13_bridge.demo2_nobridgepattern_improve;

public class Jeep implements Car{
    @Override
    public void install2000Engine() {
        System.out.println("为Jeep安装2000cc的引擎");
    }

    @Override
    public void install2200Engine() {
        System.out.println("为Jeep安装2200cc的引擎");
    }

    @Override
    public void install2400Engine() {
        System.out.println("为Jeep安装2400cc的引擎");
    }
    // 要是Jeep还有其他引擎怎么办?

}
