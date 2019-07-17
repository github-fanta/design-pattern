package pattern16_mediator.demo2_mediator;

/**
 * 中介者持有若干个类
 * 完全自主进行判断和若干个类间的交互逻辑
 */
public class Mediator {
    private Man man;
    private Woman woman;

    public void setMan(Man man) {
        this.man = man;
    }
    public void setWoman(Woman woman) {
        this.woman = woman;
    }

    public void getParter(Person person) {
        if (person instanceof Man) {
            setMan((Man)person);
        } else {
            setWoman((Woman)person);
        }
        if (man == null || woman == null) {
            System.out.println("不搞同性恋！");
            return;
        }

        if (man.getConditionLevel() == woman.getConditionLevel()) {
            System.out.println(man.getName() + "和" + woman.getName() + "绝配");
        } else {
            System.out.println(man.getName() + "和" + woman.getName() + "不配");
        }
    }


}
