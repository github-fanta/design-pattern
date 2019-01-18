package pattern07_strategy.demo2sellerdiscount;

/**
 * 策略一： 打八折
 */
public class StrategyA implements Strategy{

    @Override
    public double cost(double price) {
        return price * 0.8;
    }
}
