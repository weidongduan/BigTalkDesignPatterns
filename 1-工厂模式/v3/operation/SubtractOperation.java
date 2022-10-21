package v3.operation;

import v3.Operation;

/**
 * @author duanweidong
 * @version 2022/10/21 7:06 PM
 */
public class SubtractOperation  implements Operation {

    @Override
    public double getResult(double num1, double num2) {
        return num1 - num2;
    }
}
