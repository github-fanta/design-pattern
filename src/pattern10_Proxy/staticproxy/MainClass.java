package pattern10_Proxy.staticproxy;

public class MainClass {
    public static void main(String[] args) {

        // 不使用代理
        RealPress press = new RealPress();
        press.sellBook();

        // 使用代理
        DangDangNetProxy proxy = new DangDangNetProxy();
        proxy.sellBook();
    }
}
