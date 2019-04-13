package factory_mode.model;

/**
 * @description: 减法工厂类
 * @author: wuyanbo
 * @create: 2019-04-13 17:31
 **/

public class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
