package builder_mode.model;

/**
 * @description: 建造者抽象类
 * @author: wuyanbo
 * @create: 2019-04-18 15:42
 **/

public abstract class BaseBuilder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();

}
