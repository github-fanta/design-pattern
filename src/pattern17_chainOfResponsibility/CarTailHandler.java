package pattern17_chainOfResponsibility;

public class CarTailHandler extends CarHandler {
    @Override
    public void handle() {
        System.out.println("组装车尾");
        if (this.carHandler != null) {
            this.carHandler.handle();
        }
    }
}
