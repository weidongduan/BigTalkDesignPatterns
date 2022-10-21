package v3;

import v3.operation.AddOperation;
import v3.operation.DivideOperation;
import v3.operation.MultiplyOperation;
import v3.operation.SubtractOperation;

/**
 * @author duanweidong
 * @version 2022/10/21 7:01 PM
 */
public class OperationFactory {

    public static Operation createOperation(String operator) {
        switch (operator) {
            case "+":
                return new AddOperation();
            case "-":
                return new SubtractOperation();
            case "*":
                return new MultiplyOperation();
            case "/":
                return new DivideOperation();
            default:
                throw new RuntimeException("没有找到相应的计算方式");
        }

    }
}
