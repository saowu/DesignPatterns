package composite_mode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 枝结点
 * @author: wuyanbo
 * @create: 2019-10-02 18:16
 **/

public class Composite extends Component {
    private List<Component> list = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append('-');
        }
        System.out.println(stringBuilder + this.name);
        for (Component c : list) {
            c.display(depth + 2);
        }

    }
}
