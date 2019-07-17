package pattern23_visitor;

/**
 * 公园的B部分
 */
public class ParkB implements ParkElement {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
}
}
