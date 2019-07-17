package pattern17_chainOfResponsibility;

public class CarBodyHandler extends CarHandler {
    @Override
    public void handle() {
        System.out.println("组装车身");
        if (this.carHandler != null) {
            this.carHandler.handle();
        }
    }
}
