package pattern0301factorypatterndemo.caculatorfactorymethod.production;

public class SubstractionOperation extends Operation {
    @Override
    public double getResult() {
        return this.num1 - this.num2;
    }
}
