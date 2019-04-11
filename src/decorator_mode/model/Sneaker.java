package decorator_mode.model;

/**
 * @description: 鞋子
 * @author: wuyanbo
 * @create: 2019-04-11 13:00
 **/

public class Sneaker extends Decorator {

    public Sneaker(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.print("鞋子-");
        super.show();
    }
}
