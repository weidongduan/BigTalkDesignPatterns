package v3.operation;

import v3.Operation;

/**
 * @author duanweidong
 * @version 2022/10/21 7:08 PM
 */
public class DivideOperation implements Operation {

    @Override
    public double getResult(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException("除数不能为0");
        }
        return num1 / num2;
    }
}
