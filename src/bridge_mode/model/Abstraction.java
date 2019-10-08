package bridge_mode.model;

/**
 * @description:抽象
 * @author: wuyanbo
 * @create: 2019-10-08 18:24
 **/

public class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
