package factory_mode.model;


/**
 * @description: 减法类
 * @author: wuyanbo
 * @create: 2019-04-08 13:58
 **/

public class OperationSub extends Operation {


    @Override
    public double getResult() {
        result = getNumberA() - getNumberB();
        return result;
    }
}
