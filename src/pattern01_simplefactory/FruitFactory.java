package pattern01_simplefactory;

/**
 * 水果工厂
 * 工厂类是核心，包含必要的判断逻辑，决定创建哪个具体的类对象
 * 缺点：增加新产品 扩展要修改逻辑。使用静态工厂方法，造成工厂角色无法基于继承结构
 */
public class FruitFactory {

    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        // 方法一：一般都采用这种，只要客户传个想要的大致名字就行了如apple/Apple banana/Banana等，不需要具体的全路径名
        // 但是要添加个梨的时候就麻烦改代码
//        if (type.equalsIgnoreCase("apple")) {
//            return Apple.class.newInstance();
//        } else if (type.equalsIgnoreCase("banana")) {
//            return Banana.class.newInstance();
//        } else {
//            return null;
//        }
        // 方法二：适用性更广，但是必须传递标准的全路径名
        Class<?> fruit = Class.forName(type);
        return (Fruit) fruit.newInstance();
    }
}
