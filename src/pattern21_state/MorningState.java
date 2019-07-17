package pattern21_state;
/**
 * state跟责任链的区别就是 state模式 只要命中链条中的一个就会完成处理并返回，不再沿着下面继续处理。
 * state 处理自己的状态的同时 拨到下一个状态 起到一个dispatcher的角色
  */

public class MorningState implements State {

    @Override
    public void doSomething(Person person) {
        if (person.getHour() == 6) {
            System.out.println("吃早餐");
            person.setState(new MorningState()); //复位到状态链头 morning -> Lunch -> supper
        } else {
            person.setState(new LunchState());
            person.doSomething();
        }
    }
}
