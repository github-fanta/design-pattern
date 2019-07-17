package pattern23_visitor;

public class VisitorManager implements Visitor {
    @Override
    public void visit(Park park) {
        System.out.println("管理员：负责公园卫生检查");
    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("管理员：负责公园A部分卫生检查");
    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("管理员：负责公园B部分卫生检查");
    }
}
