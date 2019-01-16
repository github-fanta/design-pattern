package pattern02_factorymethod.factory;

import pattern02_factorymethod.product.Fruit;
import pattern02_factorymethod.product.Pear;

public class PearFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Pear();
    }
}
