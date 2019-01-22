package pattern05_builder;

public class GongyuBuilder implements HouseBuilder{
    private House house = new House();
    @Override
    public void makeFloor() {
        house.setFloor("公寓——>修建地板");
    }

    @Override
    public void makeWall() {
        house.setWall("公寓——>修建墙壁");
    }

       @Override
    public void makeHouseTop() {
        house.setHouseTop("公寓——>修建屋顶");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
