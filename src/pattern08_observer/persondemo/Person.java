package pattern08_observer.persondemo;

import java.util.Observable;

/**
 * 被观察者
 */
public class Person extends Observable {
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // 手动标记已更新
        this.setChanged();
        // 通知观测者  其实是调用本身容器里面的每个监听器的update方法。其实是把准备好的update代码，手动插入在此
        // 所谓监听完全是程序员自己在装模做样“手动”监听
        this.notifyObservers();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
