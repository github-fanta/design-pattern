package pattern21_state;

public class NoState implements State {

    @Override
    public void doSomething(Person person) {
        System.out.println("无此状态");

    }
}
