package pattern13_bridge.demo2_nobridgepattern_improve;

public class Bus implements Car{
    @Override
    public void install2000Engine() {
        System.out.println("为Bus安装2000cc发动机");
    }

    @Override
    public void install2200Engine() {
        System.out.println("为Bus安装2200cc发动机");
    }

    // 要是只有jeep有2400cc的引擎  而bus没有2400cc的引擎呢 此方法也要重写？
    // 总之，这两个维度的事情，交叉在一起，很难按照实际情况变化(所有的类都是要安装这3种引擎)
    @Override
    public void install2400Engine() {
        System.out.println("为Bus安装2400cc发动机");
    }
}
