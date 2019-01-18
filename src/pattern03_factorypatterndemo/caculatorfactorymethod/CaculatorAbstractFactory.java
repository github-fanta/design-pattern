package pattern03_factorypatterndemo.caculatorfactorymethod;

import pattern03_factorypatterndemo.caculatorfactorymethod.factory.AddOperationFactory;
import pattern03_factorypatterndemo.caculatorfactorymethod.production.Operation;

import java.util.Scanner;

/**
 * 用工厂方法实现加减乘除运算计算器
 */
public abstract class CaculatorAbstractFactory {
    public static void main(String[] args) {
        // 1.获取输入
        System.out.println("-----开始计算-----");
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个运算数：");
        String num1Str = sc.nextLine();

        System.out.println("请输入运算符:");
        String oper = sc.nextLine();

        System.out.println("请输入第二个运算数：");
        String num2Str = sc.nextLine();

        // 2.进行计算
        double result = 0;
        // 通过不同的工厂获取运算器
        if ("+".equals(oper)) {
            AddOperationFactory addFactory = new AddOperationFactory();
            Operation operation = addFactory.getOperation();
            operation.setNum1(Double.parseDouble(num1Str));
            operation.setNum2(Double.parseDouble(num2Str));
            result = operation.getResult();
        }

        // 3.返回结果
        System.out.println(num1Str + " " + oper + " " + num2Str + " = " + result);
    }
}
