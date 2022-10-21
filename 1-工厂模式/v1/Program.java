package v1;

import java.util.Scanner;

/**
 * 仅仅实现代码逻辑，没有考虑任何 封装、继承、多态的特性，写出的代码不具有可扩展性，可维护性，复用性。
 * @author duanweidong
 * @version 2022/10/21 11:40 AM
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
        double res = 0.0;
        switch (operator) {
            case "+" : res = Double.parseDouble(num1) + Double.parseDouble(num2);
            break;
            case "-" : res = Double.parseDouble(num1) - Double.parseDouble(num2);
            break;
            case "*" : res = Double.parseDouble(num1) * Double.parseDouble(num2);
            break;
            case "/" : res = Double.parseDouble(num1) / Double.parseDouble(num2);
            break;
            default:
        }
        System.out.println("结果:" + res);
    }
}
