package decorative_mode.model;

/**
 * @description: 工裤
 * @author: wuyanbo
 * @create: 2019-04-11 12:58
 **/

public class BigTrouser extends Decorative {

    public BigTrouser(Component component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.print("工裤-");
        super.show();
    }
}
