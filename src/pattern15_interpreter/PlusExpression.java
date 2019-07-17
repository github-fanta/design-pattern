package pattern15_interpreter;

/**
 * 递增解释器
 * 将上下文内容加1
 */
public class PlusExpression implements ExpressionInterpreter{

    @Override
    public void interpret(Context context) {
        System.out.println("递加处理");
        int temp = Integer.parseInt(context.getInput());
        context.setInput(String.valueOf(++temp));
        context.setOutput(temp);
    }
}
