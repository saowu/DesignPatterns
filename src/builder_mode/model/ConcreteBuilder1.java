package builder_mode.model;

/**
 * @description: 具体建造者类1
 * @author: wuyanbo
 * @create: 2019-04-18 15:43
 **/

public class ConcreteBuilder1 extends BaseBuilder {


    Product product = null;

    public ConcreteBuilder1() {
        if (product == null) {
            product = new Product();
        }
    }

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
