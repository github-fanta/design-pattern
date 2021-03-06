package pattern23_visitor;

/**
 * 公园的A部分
 */
public class ParkA implements ParkElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
