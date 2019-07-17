package pattern16_mediator.demo2_mediator;

public class MainClass {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Man zhangsan = new Man("张三", 20, mediator);
        Man lisi = new Man("李四", 20, mediator);
        Woman xiaofang = new Woman("小芳", 20, mediator);

        zhangsan.getParter(lisi);
        zhangsan.getParter(xiaofang);


    }
}
