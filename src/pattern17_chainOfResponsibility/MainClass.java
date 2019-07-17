package pattern17_chainOfResponsibility;

public class MainClass {
    public static void main(String[] args) {
        CarHeadHandler headHandler1 = new CarHeadHandler();
        CarBodyHandler bodyHandler1 = new CarBodyHandler();
        CarTailHandler carTailHandler1 = new CarTailHandler();

        headHandler1.setCarHandler(bodyHandler1);
        bodyHandler1.setCarHandler(carTailHandler1);

        headHandler1.handle();

        System.out.println("------------改成 设置handler后返回这个handler：--------------");
        // 组装车头--> 车身 --> 车尾  体现责任链 自由组合改变工作流程
        CarHeadHandler headHandler = new CarHeadHandler();
        headHandler.setCarHandler(new CarBodyHandler())
                .setCarHandler(new CarTailHandler());
        headHandler.handle();

        System.out.println("----------------调换顺序：车身--> 车头 --> 车尾-----------------");
        // 组装车身--> 车头 --> 车尾
        CarBodyHandler carBodyHandler = new CarBodyHandler();
        carBodyHandler.setCarHandler(new CarHeadHandler()).setCarHandler(new CarTailHandler());
        carBodyHandler.handle();
    }
}
