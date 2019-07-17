package pattern13_bridge.demo3_bridge;

/**
 * 将抽象(汽车类族)和行为(引擎类族) 分开
 * 抽象持有行为类的这个引用就是"桥"的概念
 */
public class MainClass {
    public static void main(String[] args) {
        Engine2000 engine2000 = new Engine2000();
        Engine2200 engine2200 = new Engine2200();
        // 安装一个2000的引擎
        Jeep jeep = new Jeep(engine2000);
        jeep.installEngine();
        // 更换个2200cc的引擎
        jeep.setEngine(engine2200 );
        jeep.installEngine();
    }
}
