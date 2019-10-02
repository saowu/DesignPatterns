package composite_mode;

import composite_mode.model.Composite;
import composite_mode.model.Leaf;

/**
 * @description: 组合模式启动类
 * @author: wuyanbo
 * @create: 2019-10-02 18:05
 **/

public class CompositeMode {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);

        Composite comp1 = new Composite("Composite XY");
        comp1.add(new Leaf("Leaf XYA"));
        comp1.add(new Leaf("Leaf XYB"));
        comp.add(comp1);

        root.add(new Leaf("Leaf C"));

        Leaf leaf_d = new Leaf("Leaf D");
        root.add(leaf_d);
        root.remove(leaf_d);

        root.display(1);
    }
}
