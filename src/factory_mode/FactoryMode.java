package factory_mode;

import factory_mode.model.AddFactory;
import factory_mode.model.IFactory;
import factory_mode.model.Operation;
import factory_mode.model.SubFactory;

/**
 * @description: 工厂方法模式
 * @author: wuyanbo
 * @create: 2019-04-13 17:27
 **/

public class FactoryMode {

    public static void main(String[] args) {
        IFactory iFactory = new AddFactory();
        Operation operation = iFactory.createOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());

        IFactory iFactory1 = new SubFactory();
        Operation operation1 = iFactory1.createOperation();
        operation1.setNumberA(1);
        operation1.setNumberB(2);
        System.out.println(operation1.getResult());
    }

}
