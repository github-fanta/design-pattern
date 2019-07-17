package pattern11_facade.demo1;

/**
 * 外观模式
 */
public class Facade {

    private SystemA A;
    private SystemB B;
    private SystemC C;
    public Facade(){
        A = new SystemA();
        B = new SystemB();
        C = new SystemC();
    }

    //
    public void doABC(){
        A.doSomething();
        B.doSomething();
        C.doSomething();
    }

    public void doAB(){
        A.doSomething();
        B.doSomething();
    }
}
