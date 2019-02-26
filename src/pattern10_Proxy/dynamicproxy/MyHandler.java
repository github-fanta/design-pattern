package pattern10_Proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

    private RealPress realPress;
    public MyHandler(RealPress realPress) {
        this.realPress = realPress;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        discount();
        Object result = method.invoke(realPress, args);
        give();
        return null;
    }

    private void give() {
        System.out.println("赠送优惠券");
    }

    private void discount() {
        System.out.println("打折");
    }
}
