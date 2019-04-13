package factory_mode.model;

/**
 * @description: 除法法工厂类
 * @author: wuyanbo
 * @create: 2019-04-13 17:31
 **/

public class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
