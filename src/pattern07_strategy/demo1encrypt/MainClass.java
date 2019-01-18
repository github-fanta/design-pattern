package pattern07_strategy.demo1encrypt;

public class MainClass {
    public static void main(String[] args) {
        Context context = new Context(new RSAStrategy());
        context.encrypt();
    }
}
