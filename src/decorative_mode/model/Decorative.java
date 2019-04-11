package decorative_mode.model;

/**
 * @description: 装饰类
 * @author: wuyanbo
 * @create: 2019-04-11 12:47
 **/

public class Decorative extends Component {


    private Component component;


    public Decorative(Component component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
