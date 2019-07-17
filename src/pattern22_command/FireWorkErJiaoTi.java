package pattern22_command;

/**
 * 二脚踢
 */
public class FireWorkErJiaoTi extends Firework {

    public FireWorkErJiaoTi(Gunpowder gunpowder) {
        this.gunpowder = gunpowder;
    }
    // 组装二脚踢 (二脚踢响两声)
    @Override
    public void fire()  {
        System.out.println("-----发射二脚踢-----");
        gunpowder.fireSound();
        gunpowder.fireSound();
    }
}
