package pattern22_command;

/**
 * 礼花弹
 */
public class FireWorkLiHuaDan extends Firework {

    public FireWorkLiHuaDan(Gunpowder gunpowder) {
        this.gunpowder = gunpowder;
    }
    // 组装礼花弹
    @Override
    public void fire() {
        System.out.println("-----发射礼花弹-----");
        gunpowder.fireGreen();
        gunpowder.fireRed();
        gunpowder.fireSound();
    }
}
