package pattern05_builder;

public interface HouseBuilder {
    // 修建地板
    public void makeFloor();
    // 修建墙壁
    public void makeWall();
    // 修建房顶
    public void makeHouseTop();
    public House getHouse();
}
