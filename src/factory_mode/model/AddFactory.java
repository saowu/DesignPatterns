package factory_mode.model;

/**
 * @description: 加法工厂类
 * @author: wuyanbo
 * @create: 2019-04-13 17:31
 **/

public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }
}
