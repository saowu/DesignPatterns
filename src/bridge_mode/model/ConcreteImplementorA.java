package bridge_mode.model;

/**
 * @description:具体实现A
 * @author: wuyanbo
 * @create: 2019-10-08 18:21
 **/

public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
