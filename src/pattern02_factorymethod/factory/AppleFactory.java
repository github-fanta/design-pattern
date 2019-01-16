package pattern02_factorymethod.factory;

import pattern02_factorymethod.product.Apple;
import pattern02_factorymethod.product.Fruit;

public class AppleFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
