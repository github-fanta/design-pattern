package pattern13_bridge.demo3_bridge;

public class Jeep extends Car{
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("为Jeep安装:");
        this.getEngine().installEngine(); // 调用持有的引擎完成安装引擎
    }
}
