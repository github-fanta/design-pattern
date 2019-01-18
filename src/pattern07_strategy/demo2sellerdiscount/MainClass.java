package pattern07_strategy.demo2sellerdiscount;

public class MainClass {
    public static void main(String[] args) {
        Context context = new Context(new StrategyB());
        System.out.println("实际应付：" + context.cost(1000));
    }

}
