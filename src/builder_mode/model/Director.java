package builder_mode.model;


/**
 * @description: 指挥者类
 * <p>
 * 来指挥具体的建造过程（严格）
 * @author: wuyanbo
 * @create: 2019-04-18 15:47
 **/

public class Director {
    public void Construct(BaseBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
