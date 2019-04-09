package simple_factory_mode;

import simple_factory_mode.model.Operation;
import simple_factory_mode.model.OperationAdd;
import simple_factory_mode.model.OperationDiv;
import simple_factory_mode.model.OperationMul;
import simple_factory_mode.model.OperationSub;

/**
 * @description: 运算工厂
 * @author: wuyanbo
 * @create: 2019-04-08 14:07
 **/

public class OperationFactory {


    public static Operation createOperation(char oper) {
        Operation operation = null;
        switch (oper) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
        }
        return operation;

    }

}
