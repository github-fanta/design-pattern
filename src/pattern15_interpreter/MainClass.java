package pattern15_interpreter;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        // 初始上下文
        Context context = new Context();
        context.setInput("100");
        // 解释器列表
        List<ExpressionInterpreter> interpreterList = new ArrayList<>();
        interpreterList.add(new PlusExpression());
        interpreterList.add(new MinusExpression());
        interpreterList.add(new MinusExpression());
        for (ExpressionInterpreter interpreter : interpreterList) {
            interpreter.interpret(context);
            System.out.println(context.getOutput());
        }
    }
}
