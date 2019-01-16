package pattern0301factorypatterndemo.caculatorsimplefactory;

public class DivideOperation extends Operation {
    @Override
    public double getResult() {
        // 可进行分母非零判断
        return this.num1 / this.num2;
    }
}
