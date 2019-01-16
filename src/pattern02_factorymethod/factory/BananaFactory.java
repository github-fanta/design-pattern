package pattern02_factorymethod.factory;

import pattern02_factorymethod.product.Banana;
import pattern02_factorymethod.product.Fruit;

public class BananaFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
