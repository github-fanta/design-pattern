package pattern08_observer.persondemo;

public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        // 向被观察者容器中添加观察者，发生改变再调用观察者的update方法。
        person.addObserver(new MyObserver());
        // person.deleteObservers();
        // person.addObserver(new MyObserver()); 可以添加多个监听器，可以执行多个监听器的逻辑
        person.setName("张三");
    }
}
