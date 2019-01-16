package pattern0301factorypatterndemo.caculatorfactorymethod.production;

public class AdditionOperation extends Operation {
    @Override
    public double getResult() {
        return this.num1 + this.num2;
    }
}
