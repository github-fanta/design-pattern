package pattern03_abstractfactory.product;

public class Pear implements Fruit {
    @Override
    public void get() {
        System.out.println("采集梨子");
    }
}
