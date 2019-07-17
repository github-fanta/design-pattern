package pattern19_memento;


public class MainClass {
    public static void main(String[] args) {

        Person person = new Person("张三", "男", 50);
        person.display();

        // 备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(person.createMemento());
        // 修改
        person.setName("变了"); // 修改
        person.display();
        // 恢复
        person.rollback(caretaker.getMemento());
        person.display();


    }
}
