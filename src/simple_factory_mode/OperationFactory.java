package simple_factory_mode;

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
