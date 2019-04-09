package simple_factory_mode.model;


/**
 * @description: 除法类
 * @author: wuyanbo
 * @create: 2019-04-08 14:02
 **/

public class OperationDiv extends Operation {

    @Override
    public double getResult(){
        result = getNumberA() / getNumberB();
        return result;
    }
}
