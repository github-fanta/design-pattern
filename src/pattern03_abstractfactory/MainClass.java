package pattern03_abstractfactory;

import pattern03_abstractfactory.factory.NorthAppleSouthBanana;
import pattern03_abstractfactory.factory.SouthFruitFactory;
import pattern03_abstractfactory.product.Fruit;
import pattern03_abstractfactory.factory.NorthFruitFactory;

/**
 * 想提供什么组合就提供什么组合，产品就是个橡皮泥，是个软柿子，想把这些小零件怎么组合就怎么组合，
 * 只要满足抽象工厂的组合规则就行。
 */
public class MainClass {
    public static void main(String[] args) {
        // 获取一种组合(全部是北方水果的组合)方式的工厂
        NorthFruitFactory northFactory = new NorthFruitFactory();

        Fruit nApple = northFactory.getApple();
        Fruit nBanana = northFactory.getBanana();
        nApple.get();
        nBanana.get();

        // 获取另外一种组合(全部是南方水果的组合)方式的工厂
        SouthFruitFactory southFactory = new SouthFruitFactory();

        Fruit sApple = southFactory.getApple();
        Fruit sBanana = southFactory.getBanana();
        sApple.get();
        sBanana.get();

        // 还可以北方苹果，南方香蕉这样，又是一个新的组合方式
        NorthAppleSouthBanana bAppleSBanana = new NorthAppleSouthBanana();
        Fruit apple = bAppleSBanana.getApple();
        Fruit banana = bAppleSBanana.getBanana();
        apple.get();
        banana.get();
    }
}
