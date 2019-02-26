package pattern10_Proxy.dynamicproxy;

import java.lang.reflect.Proxy;
// 并没有生成代理对象  代理对象是由JDK生成的 把代理的逻辑抽出来符合InvocationHandler规范
public class MainClass {
    public static void main(String[] args) {
        RealPress realPress = new RealPress();
        SellBookInterface proxy = (SellBookInterface) Proxy.newProxyInstance(RealPress.class.getClassLoader(), realPress.getClass().getInterfaces(), new MyHandler(realPress));
        proxy.sellBook();
    }
}
