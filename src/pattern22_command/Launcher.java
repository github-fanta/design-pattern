package pattern22_command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 烟花发射架
 * Invoker
 */
public class Launcher {
    private List<Firework> fireworks;
    public Launcher() {
        fireworks = new ArrayList<>();
    }
    // 往桶里加烟花
    public void add(Firework firework) {
        fireworks.add(firework);
    }

    // 点燃发射架上所有烟花
    public void fire() {
        Iterator<Firework> iterator = fireworks.iterator();
        while (iterator.hasNext()) {
            iterator.next().fire();
        }
    }
}
