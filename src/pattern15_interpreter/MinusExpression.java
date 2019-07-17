package pattern15_interpreter;

/**
 * 递减解释器
 * 将上下文内容减1
 */
public class MinusExpression implements ExpressionInterpreter{
    @Override
    public void interpret(Context context) {
        System.out.println("递减处理");
        int temp = Integer.parseInt(context.getInput());
        context.setInput(String.valueOf(--temp));
        context.setOutput(temp);
    }
}
