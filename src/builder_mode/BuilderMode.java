package builder_mode;

import builder_mode.model.*;

/**
 * @description: 建造者模式
 * <p>
 * 具体产品表现与建造过程分离
 * @author: wuyanbo
 * @create: 2019-04-18 15:32
 **/

public class BuilderMode {

    public static void main(String[] args) {
        Director director = new Director();

        BaseBuilder concreteBuilder1 = new ConcreteBuilder1();
        director.Construct(concreteBuilder1);
        Product result1 = concreteBuilder1.getResult();
        result1.show();

        BaseBuilder concreteBuilder2 = new ConcreteBuilder2();
        director.Construct(concreteBuilder2);
        Product result2 = concreteBuilder2.getResult();
        result2.show();

    }
}
