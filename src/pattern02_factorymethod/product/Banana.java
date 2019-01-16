package pattern02_factorymethod.product;

public class Banana implements Fruit {
    /*
     * 采集香蕉
     */
    @Override
    public void get() {
        System.out.println("采集香蕉");
    }
}
