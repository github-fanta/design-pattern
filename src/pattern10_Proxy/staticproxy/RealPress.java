package pattern10_Proxy.staticproxy;
// 出版社
public class RealPress implements SellBookInterface{

    @Override
    public void sellBook() {
        System.out.println("卖书");
    }
}
