package pattern07_strategy.demo2sellerdiscount;


/**
 * 策略二： 满 200 减 50
 */
public class StrategyB implements Strategy {
    @Override
    public double cost(double price) {
        return price > 200 ? price - 50 : price;
    }
}
