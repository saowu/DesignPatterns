package builder_mode.model;

/**
 * @description: 具体建造者类2
 * @author: wuyanbo
 * @create: 2019-04-18 15:43
 **/

public class ConcreteBuilder2 extends BaseBuilder {


    Product product = null;

    public ConcreteBuilder2() {
        if (product == null) {
            product = new Product();
        }
    }

    @Override
    public void buildPartA() {
        product.add("部件X");
    }

    @Override
    public void buildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
