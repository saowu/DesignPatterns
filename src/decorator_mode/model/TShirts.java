package decorator_mode.model;

/**
 * @description: T恤
 * @author: wuyanbo
 * @create: 2019-04-11 12:54
 **/

public class TShirts extends Decorator {

    public TShirts(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.print("T恤-");
        super.show();
    }
}
