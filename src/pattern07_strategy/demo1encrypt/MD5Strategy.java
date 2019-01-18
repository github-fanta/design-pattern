package pattern07_strategy.demo1encrypt;

public class MD5Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("使用MD5加密");
    }
}
