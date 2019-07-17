package pattern22_command;

public class MainClass {
    public static void main(String[] args) {
        Gunpowder gunpowder = new Gunpowder();
        FireWorkErJiaoTi erJiaoTi = new FireWorkErJiaoTi(gunpowder);
        FireWorkLiHuaDan liHuaDan = new FireWorkLiHuaDan(gunpowder);
        // 发射架
        Launcher launcher = new Launcher();
        // 填装弹药 二脚踢 和 礼花弹
        launcher.add(erJiaoTi);
        launcher.add(liHuaDan);
        launcher.fire();
    }
}
