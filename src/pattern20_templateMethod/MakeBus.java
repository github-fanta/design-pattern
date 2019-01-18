package pattern20_templateMethod;

public class MakeBus extends MakeVehicle{
    @Override
    public void makeHead() {
        System.out.println("Bus:生产头部");
    }

    @Override
    public void makeBody() {
        System.out.println("Bus:生产车身");
    }

    @Override
    public void makeTail() {
        System.out.println("Bus:生产车尾");
    }
}
