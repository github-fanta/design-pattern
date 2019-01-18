package pattern03_factorypatterndemo.caculatorfactorymethod.factory;

import pattern03_factorypatterndemo.caculatorfactorymethod.production.Operation;

/**
 * 工厂方法
 * 符合开放原则：
 * 把简单工厂中的 if else 改成 继承，把OperationFactory 做成抽象类 具体的运算器的实例化交给具体的工厂去做
 */

public abstract class OperationFactory {
    public abstract Operation getOperation();

    /*
     *  换掉下面的if else
     */
//    if ("+".equals(oper)) {
//        return new AdditionOperation();
//    } else if ("-".equals(oper)) {
//        return new SubstractionOperation();
//    } else if ("*".equals(oper)) {
//        return new MultiOperation();
//    } else if ("/".equals(oper)) {
//        // 这里可以对分母做个非零判断 ...
//        return new DivideOperation();
//    }
//        return null;
}
