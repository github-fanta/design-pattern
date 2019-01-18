package pattern03_factorypatterndemo.caculatorsimplefactory;

public class AdditionOperation extends Operation {
    @Override
    public double getResult() {
        return this.num1 + this.num2;
    }
}
