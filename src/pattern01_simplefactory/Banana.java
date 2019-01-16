package pattern01_simplefactory;

public class Banana implements Fruit{
    /*
     * 采集香蕉
     */
    @Override
    public void get() {
        System.out.println("采集香蕉");
    }
}
