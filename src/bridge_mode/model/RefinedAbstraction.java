package bridge_mode.model;

/**
 * @description:被提炼的抽象
 * @author: wuyanbo
 * @create: 2019-10-08 18:30
 **/

public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
