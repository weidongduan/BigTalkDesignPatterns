package v3;

import java.util.Scanner;

/**
 * 使用工厂模式来构建
 * @author duanweidong
 * @version 2022/10/21 2:55 PM
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("请输入数字1:");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        System.out.println("请输入操作符: +、-、*、/ 中的一个");
        String operator = scanner.nextLine();
        System.out.println("请输入数字2:");
        String num2 = scanner.nextLine();
        Operation operation = OperationFactory.createOperation(operator);
        double res = operation.getResult(Double.parseDouble(num1), Double.parseDouble(num2));
        System.out.println("结果:" + res);
    }
}
