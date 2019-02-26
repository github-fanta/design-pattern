package pattern10_Proxy.staticproxy;
/**
 * 当当网 代理出版社卖书
 */
public class DangDangNetProxy implements SellBookInterface{

    private RealPress realPress;

    @Override
    public void sellBook() {
        // 卖书前打折
        discount();

        if (realPress == null) {
            realPress = new RealPress();
        }
        realPress.sellBook();

        // 卖书后赠送优惠券
        give();
    }

    private void discount() {
        System.out.println("打折");
    }

    private void give() {
        System.out.println("赠送代金券");
    }
}
