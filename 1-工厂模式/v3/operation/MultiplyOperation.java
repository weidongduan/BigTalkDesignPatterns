package v3.operation;

import v3.Operation;

/**
 * @author duanweidong
 * @version 2022/10/21 7:10 PM
 */
public class MultiplyOperation implements Operation {

    @Override
    public double getResult(double num1, double num2) {
        return num1 * num2;
    }
}
