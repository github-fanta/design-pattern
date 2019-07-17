package pattern23_visitor;

/**
 * 公园每一部分的抽象
 */
public interface ParkElement {
    // 用来接纳访问者的
    void accept(Visitor visitor);
}
