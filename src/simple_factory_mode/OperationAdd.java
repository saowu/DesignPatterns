package simple_factory_mode;

/**
 * @description: 加法类
 * @author: wuyanbo
 * @create: 2019-04-08 13:52
 **/

public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        result = getNumberA() + getNumberB();
        return result;
    }
}
