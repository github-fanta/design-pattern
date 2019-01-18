package pattern07_strategy.demo1encrypt;

public class RSAStrategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("使用RSA加密");
    }
}
