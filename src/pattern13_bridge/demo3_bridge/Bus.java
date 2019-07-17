package pattern13_bridge.demo3_bridge;

public class Bus extends Car{
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("为Bus安装:");
        this.getEngine().installEngine(); // 调用自己持有的engine安装引擎
    }
}
