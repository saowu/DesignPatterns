package simple_factory_mode;

/**
 * @description: 乘法类
 * @author: wuyanbo
 * @create: 2019-04-08 14:00
 **/

public class OperationMul extends Operation {


    @Override
    public double getResult() {
        result = getNumberA() * getNumberB();
        return result;
    }
}
