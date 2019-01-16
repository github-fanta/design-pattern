package pattern03_abstractfactory.product;

public class NorthApple extends Apple {
    @Override
    public void get() {
        System.out.println("采集北方水果");
    }
}
