package pattern22_command;

/**
 * 这里就是命令模式的command类
 *
 */
public abstract class Firework {
    // 持有火药
    protected Gunpowder gunpowder;

    public void setGunpowder(Gunpowder gunpowder) {
        this.gunpowder = gunpowder;
    }

    public abstract void fire();
}
