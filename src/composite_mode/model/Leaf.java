package composite_mode.model;

/**
 * @description: 叶子结点
 * @author: wuyanbo
 * @create: 2019-10-02 18:09
 **/

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            stringBuilder.append('-');
        }
        System.out.println(stringBuilder + this.name);
    }
}
