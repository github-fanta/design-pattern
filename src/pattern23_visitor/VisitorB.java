package pattern23_visitor;
/**
 * 清洁工B负责parkB的卫生情况
 */
public class VisitorB implements Visitor {
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {

    }

    @Override
    public void visit(ParkB parkB) {
        System.out.println("清洁工B完成公园B的卫生");
    }
}
