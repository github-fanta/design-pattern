package pattern07_strategy.demo2sellerdiscount;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double cost(double price) {
        return strategy.cost(price);
    }
}
