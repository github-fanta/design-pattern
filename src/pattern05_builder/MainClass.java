package pattern05_builder;

public class MainClass {
    public static void main(String[] args) {
        // 1. 客户端自己建造房子
        House house1 = new House();
        house1.setFloor("平房地板");
        // 隔天想要建造公寓了  要修改，必须在自己代码修改
        // house1.setFloor("公寓地板");
        house1.setWall("平房墙壁");
        house1.setHouseTop("平房屋顶");

        // 2. 使用建筑队建房子  但是还是要客户端管理建造的步骤
        System.out.println("------客户端直接使用建筑队------");
        HouseBuilder PFBuilder = new PingFangBuilder();
        // 隔天想修建公寓了就  new GongyuBuilder();
        PFBuilder.makeFloor();
        PFBuilder.makeWall();
        PFBuilder.makeHouseTop();
        House house2 = PFBuilder.getHouse();
               System.out.println(house2.getFloor());
        System.out.println(house2.getWall());
        System.out.println(house2.getHouseTop());

        // 3. 引进管理者 设计院的角色 将建造逻辑封装在Director中。
        // 具体建造细节的不同可以更换不同工程队来解决
        // 注意的是，指挥者需要客户端指定哪个建筑队， 客户端从建筑队获得房子，而不是直接从指挥者手中。
        System.out.println("-------加入Director------");
        GongyuBuilder GYBuilder = new GongyuBuilder();
        HouseDirector director = new HouseDirector(GYBuilder);
        director.makeHouse();

        House house3 = GYBuilder.getHouse();
        System.out.println(house3.getFloor());
        System.out.println(house3.getWall());
        System.out.println(house3.getHouseTop());



    }
}
