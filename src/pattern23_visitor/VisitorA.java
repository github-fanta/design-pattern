package pattern23_visitor;

/**
 * 清洁工A负责parkA的卫生情况
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(Park park) {

    }

    @Override
    public void visit(ParkA parkA) {
        System.out.println("清洁工A完成了公园A的卫生");
    }

    @Override
    public void visit(ParkB parkB) {

    }
}
