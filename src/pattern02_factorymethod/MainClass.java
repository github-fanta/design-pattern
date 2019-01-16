package pattern02_factorymethod;

import pattern02_factorymethod.factory.AppleFactory;
import pattern02_factorymethod.factory.BananaFactory;
import pattern02_factorymethod.factory.FruitFactory;
import pattern02_factorymethod.factory.PearFactory;
import pattern02_factorymethod.product.Fruit;

/**
 * 工厂方法模式演示
 * 1）简单工厂模式只需要每次去找工厂这个大内总管要东西就行了，工厂方法模式还得知道每一种产品的对应工厂是什么。
 *          所以从客户端MainClass的使用来看，好像还变得更复杂了呢。
 * 2）但是当添加新的产品时，简单工厂模式要去增加if-else代码，修改工厂代码。而工厂方法只需要添加新产品和产品工厂即可
 * “对修改封闭，对扩展开放”
 */
public class MainClass {

    public static void main(String[] args){

        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.getFruit();
        apple.get();
        banana.get();

        //现在添加一种新的产品——梨  添加产品Pear 和 工厂PearFactory
        PearFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.getFruit();
        pear.get();
        // 可以发现，实现新的产品，工厂的逻辑完全可以不用改变
    }
}
