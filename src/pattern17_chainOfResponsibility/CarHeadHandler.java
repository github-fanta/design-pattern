package pattern17_chainOfResponsibility;

public class CarHeadHandler extends CarHandler {
    @Override
    public void handle() {
        System.out.println("组装车头");
        if (this.carHandler != null) {
            this.carHandler.handle();
        }
    }
}
