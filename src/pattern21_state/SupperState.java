package pattern21_state;

public class SupperState implements State {
    @Override
    public void doSomething(Person person) {
        if (person.getHour() == 18) {
            System.out.println("吃晚餐");
            person.setState(new MorningState()); //复位到状态链头 morning -> Lunch -> supper
        } else {
            person.setState(new NoState());
            person.doSomething();
        }
    }
}
