package pattern21_state;

public class MainClass {
    public static void main(String[] args) {

        Person person = new Person();

        // 吃午餐
        person.setHour(12);
        person.doSomething();

        // 吃早餐
        person.setHour(6);
        person.doSomething();

//        person.setHour(6);
//        person.doSomething();
//
//        person.setHour(18);
//        person.doSomething();

    }
}
