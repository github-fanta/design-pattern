package pattern16_mediator.demo1_withoutmediator;

public class Man extends Person{
    public Man(String name, int conditionLevel) {
        super(name, conditionLevel);
    }

    /**
     * 两个类(Man 和 Woman)之间的交互判断全部在类里面
      * Man 和 Woman之间的判断逻辑基本相同，所以把这段交互逻辑放在一个中介者之中。
     */
    @Override
    public void getParter(Person person) {
        if (person instanceof Man) {
            System.out.println("我不搞同性恋");
        } else {
            if (this.getConditionLevel() == person.getConditionLevel()) {
                System.out.println(this.getName() + "配对" + person.getName()+"成功！");
            } else {
                System.out.println(this.getName() + "配对" + person.getName()+"失败!");
            }
        }
    }
}
