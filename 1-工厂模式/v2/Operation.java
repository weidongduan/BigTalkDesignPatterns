package v2;

/**
 *
 * 提升：这个计算器做了一个封装，把负责显示的和负责逻辑计算的功能做隔离。易变的计算逻辑封装到Operation类中。
 * @author duanweidong
 * @version 2022/10/21 2:43 PM
 */
public class Operation {

    private double num1;

    private double num2;

    private String operator;

    public Operation(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getResult() {
        double res = 0.0;
        switch (operator) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            default:
                throw new RuntimeException("操作符有误");
        }
        return res;
    }
}
