package pattern05_builder;

/**
 * 指挥者角色：设计院
 */
public class HouseDirector {
    // 设计院持有工厂队，具体哪个工程队需要在客户端指定
    private HouseBuilder builder;
    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void makeHouse() {
        builder.makeFloor();
        builder.makeWall();
        builder.makeHouseTop();
    }


}
