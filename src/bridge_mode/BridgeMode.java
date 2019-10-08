package bridge_mode;

import bridge_mode.model.Abstraction;
import bridge_mode.model.ConcreteImplementorA;
import bridge_mode.model.ConcreteImplementorB;
import bridge_mode.model.RefinedAbstraction;

/**
 * @description: 桥接模式启动类
 * @author: wuyanbo
 * @create: 2019-10-08 18:19
 **/

public class BridgeMode {
    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction();

        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();

        abstraction.setImplementor(new ConcreteImplementorB());
        abstraction.operation();
    }
}
