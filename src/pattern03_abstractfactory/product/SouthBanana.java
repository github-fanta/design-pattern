package pattern03_abstractfactory.product;

public class SouthBanana extends Banana {
    @Override
    public void get() {
        System.out.println("采集南方香蕉");
    }
}
