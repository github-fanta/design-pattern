package pattern0301factorypatterndemo.caculatorsimplefactory;

/**
 *简单工厂的静态工厂
 * 符合开放原则：可以扩展； 但是不符合封闭原则：需要修改类OperationFactory
 * 工厂方法：我们又想到把这里面的if else 改成 继承，把OperationFactory 做成抽象类 具体的运算器的实例化交给具体的工厂去做
 */

public class OperationFactory {
    public static Operation getOperation(String oper){
        if ("+".equals(oper)) {
            return new AdditionOperation();
        } else if ("-".equals(oper)) {
            return new SubstractionOperation();
        } else if ("*".equals(oper)) {
            return new MultiOperation();
        } else if ("/".equals(oper)) {
            // 这里可以对分母做个非零判断 ...
            return new DivideOperation();
        }
        return null;
    }
}
