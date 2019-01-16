package pattern03_abstractfactory.factory;

import pattern03_abstractfactory.product.Fruit;

/**
 * 真正对这些product进行组合、抽象的工厂们
 * 水果这些羔羊们，是按水果种类(苹果/香蕉)来分的，而这些奸猾的工厂们是按照自己的意愿来组合一个产品族(不同水果组合一起)
 * 而下面的工厂们就是按照这个组合意愿来提供产品的，不同的工厂是在具体提供上选择不同的产品，只要满足抽象工厂的意思就行了。
 * 每一种组合就形成一个新的具体工厂
 * 缺点：添加新的产品很麻烦，要修改抽象工厂和具体工厂的代码
 */
public interface FruitFactory {
    Fruit getApple();
    Fruit getBanana();
}
