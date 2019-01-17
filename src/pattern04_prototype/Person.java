package pattern04_prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    private String name;
    private int age;

    // 测试深浅克隆
    private List<String> friends;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    // 浅拷贝 拷贝每个成员变量
    public Person shallowClone() {
        try {
            return (Person)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 深拷贝 追溯到每个成员变量所引用的对象
    public Person deepClone() {
        Person newPerson = new Person();
        ArrayList<String> newFriends = new ArrayList<>();
        for (String p : friends) {
            newFriends.add(String.valueOf(p));
        }
        newPerson.setFriends(newFriends);
        return newPerson;
    }
}
