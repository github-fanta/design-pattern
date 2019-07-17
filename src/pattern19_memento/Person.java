package pattern19_memento;

public class Person {
    private String name;
    private String sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // 创建一个备份
    public Memento createMemento() {
        return new Memento(name, sex, age);
    }

    // 恢复一个备份
    public void rollback(Memento memento) {
        this.name = memento.getName();
        this.sex = memento.getSex();
        this.age = memento.getAge();
    }
    // 打印
    public void display() {
        System.out.println("name:" + name
                + "sex:" + sex
                + "age:" + age);
    }


    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
