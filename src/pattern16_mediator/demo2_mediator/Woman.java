package pattern16_mediator.demo2_mediator;

public class Woman extends Person{

    public Woman(String name, int conditionLevel, Mediator mediator) {
        super(name, conditionLevel, mediator);
    }

    /**
     * 两个类(Man 和 Woman)之间的交互判断全部在类里面
      * Man 和 Woman之间的判断逻辑基本相同，所以把这段交互逻辑放在一个中介者之中。
     */

    @Override
    public void getParter(Person person) {
       getMediator().setWoman(this);
       getMediator().getParter(person);
    }
}
