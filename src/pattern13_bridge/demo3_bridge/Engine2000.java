package pattern13_bridge.demo3_bridge;

public class Engine2000 implements Engine{
    @Override
    public void installEngine() {
        System.out.println("安装2000cc的引擎");
    }
}
