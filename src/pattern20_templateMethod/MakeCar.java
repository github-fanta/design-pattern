package pattern20_templateMethod;


public class MakeCar extends MakeVehicle{
    @Override
    public void makeHead() {
        System.out.println("Car:生产头部");
    }

    @Override
    public void makeBody() {
        System.out.println("Car:生产车身");
    }

    @Override
    public void makeTail() {
        System.out.println("Car:生产车尾");
    }
}
