package pattern21_state;

public class LunchState implements State {
    @Override
    public void doSomething(Person person) {
        if (person.getHour() == 12) {
            System.out.println("吃午餐");
            person.setState(new MorningState()); //复位到状态链头 morning -> Lunch -> supper
        } else {
            person.setState(new SupperState());
            person.doSomething();
        }
    }
}
