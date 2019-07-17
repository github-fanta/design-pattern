package pattern13_bridge.demo1_nobridgepattern;

/**
 * 在类和行为牵扯到一起的时候
 * 类的选择有Jeep和Bus 而行为有安装2000cc还是2200cc发动机。类的抽象和行为这两个维度的组合造成
 * 类创建的泛滥：
 *        如果抽象部分又新增一个类，那么要为这个类扩展不同的发动机的类
 *        如果行为部分新增了一种发动机，那么所有现有的类(Bus/Jeep)都要新添加一个安装新发动机的子类
 */
public class MainClass {
    public static void main(String[] args) {

        Jeep2200 jeep2200 = new Jeep2200();
        jeep2200.installEngine();
        // 如果需要2000cc发动机的Jeep就要重新new一个
        Jeep2000 jeep2000 = new Jeep2000();
        jeep2000.installEngine();
        // 需要2000cc发动机的bus
        Bus2000 bus2000 = new Bus2000();
        bus2000.installEngine();
        // 需要2200cc发动机的bus
        Bus2200 bus2200 = new Bus2200();
        bus2200.installEngine();
    }
}
