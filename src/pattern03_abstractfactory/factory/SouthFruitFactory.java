package pattern03_abstractfactory.factory;

import pattern03_abstractfactory.product.Fruit;
import pattern03_abstractfactory.product.SouthApple;
import pattern03_abstractfactory.product.SouthBanana;

public class SouthFruitFactory implements FruitFactory {
    @Override
    public Fruit getApple() {
        return (Fruit) new SouthApple();
    }

    @Override
    public Fruit getBanana() {
        return (Fruit) new SouthBanana();
    }
}
