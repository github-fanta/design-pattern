package pattern0301factorypatterndemo;

import java.util.Scanner;

/**
 * 面向过程的加减乘除计算器程序
 */
public class CaculatorProcedureOriented {
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
        if ("+".equals(oper)) {
            result = Double.parseDouble(num1Str) + Double.parseDouble(num2Str);
        } else if ("-".equals(oper)) {
            result = Double.parseDouble(num1Str) - Double.parseDouble(num2Str);
        } else if ("*".equals(oper)) {
            result = Double.parseDouble(num1Str) * Double.parseDouble(num2Str);
        } else if ("/".equals(oper)) {
            // 这里可以对分母做个非零判断 ...
            result = Double.parseDouble(num1Str) / Double.parseDouble(num2Str);
        }

        // 3.返回结果
        System.out.println(num1Str + " " + oper + " " + num2Str + "=" + result);
    }
}
