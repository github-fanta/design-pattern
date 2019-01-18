package pattern20_templateMethod;

public abstract class MakeVehicle {
    // 将统一步骤在抽象方法中完成。把调用的具体细节甩给具体实现类
    public void make() {
        System.out.println("\n-------开始生产车-------");
        // doing some other things in this place
        makeHead();
        makeBody();
        makeTail();
    }
    // 抽象方法交给抽象类去实现
    public abstract void makeHead();
    public abstract void makeBody();
    public abstract void makeTail();
}
