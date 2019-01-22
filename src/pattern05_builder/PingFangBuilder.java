package pattern05_builder;

public class PingFangBuilder implements  HouseBuilder{
    private House house = new House();
    @Override
    public void makeFloor() {
        house.setFloor("平房——>修建地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房——>修建墙壁");
    }

    @Override
    public void makeHouseTop() {
        house.setHouseTop("平房——>修建房顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
