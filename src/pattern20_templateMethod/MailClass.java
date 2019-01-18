package pattern20_templateMethod;
/**
 * 模板方法模式：
 * 1） 具有统一的操作步骤或操作过程
 * 2） 具有不同的操作细节
 * 3） 存在多个具有同样操作步骤的应用场景，但某些具体的操作细节却各不相同
 * 如 SpringJDBC shi java的规范：
 * 规范：
 *  1.加载驱动类DriverManager
 *  2.建立连接
 *  3.创建语句集(标准语句集、预处理语句集)（语句集？ MySQL、Oracle、SQLServer、Access）
 *  4.执行语句集
 *  5.结果集ResultSet （返回形式？游标/List）
 *
 */
public class MailClass {
    public static void main(String[] args) {
        MakeCar car = new MakeCar();
        car.make();
        MakeBus bus = new MakeBus();
        bus.make();
    }
}
