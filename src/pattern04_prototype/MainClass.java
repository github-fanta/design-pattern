package pattern04_prototype;

import java.util.ArrayList;

/**
 * Prototype模式是一种对象创建型模式，它采取复制原型对象的方法来创建对象的实例。
 * 使用Prototype模式创建的实例，具有与原型一样的数据
 *
 * 使用场景：
 * 1） 创建对象时，希望被创建的对象继承其基类的基本结构，还希望继承原型对象的数据
 * 2） 希望对目标对象的修改不影响既有的原型对象(深度克隆的时候可以完全互不影响)
 * 3） 隐藏克隆操作的细节。很多时候，对对象本身的克隆需要涉及到类本身的数据细节。如本例中的shallowClone(),deepClone()
 */
public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(10);

        ArrayList<String> list = new ArrayList<>();
        list.add("friend1");
        list.add("friend2");
        person1.setFriends(list);

        // 调用浅拷贝
        Person shallowP = person1.shallowClone();
        // 调用深拷贝
        Person deepP = person1.deepClone();

        // 深拷贝不一样
        deepP.getFriends().add("deep");
        System.out.println("----深拷贝添加朋友‘deep’结果：-----");
        System.out.println("原对象friendsList:" + person1.getFriends());
        System.out.println("深拷贝对象friendsList:" + deepP.getFriends());

        // 浅拷贝一样
        shallowP.getFriends().add("shallow");
        System.out.println("----浅拷贝添加朋友‘shallow’结果：----");
        System.out.println("原对象friendsList:" + person1.getFriends());
        System.out.println("深拷贝对象friendsList:" + shallowP.getFriends());
    }
}
