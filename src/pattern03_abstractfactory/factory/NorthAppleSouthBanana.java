package pattern03_abstractfactory.factory;

import pattern03_abstractfactory.product.Fruit;
import pattern03_abstractfactory.product.NorthApple;
import pattern03_abstractfactory.product.SouthBanana;

public class NorthAppleSouthBanana implements FruitFactory {
    @Override
    public Fruit getApple() {
        return new NorthApple();
    }

    @Override
    public Fruit getBanana() {
        return new SouthBanana();
    }
}
