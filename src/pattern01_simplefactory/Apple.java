package pattern01_simplefactory;

public class Apple implements Fruit{
    /*
     * 采集苹果
     */
    @Override
    public void get() {
        System.out.println("采集苹果");
    }
}
