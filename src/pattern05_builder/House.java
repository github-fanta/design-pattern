package pattern05_builder;

public class House {
    // 地板
    private String floor;
    // 墙壁
    private String wall;
    // 房顶
    private String HouseTop;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getHouseTop() {
        return HouseTop;
    }

    public void setHouseTop(String houseTop) {
        HouseTop = houseTop;
    }
}
