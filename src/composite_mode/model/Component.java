package composite_mode.model;

/**
 * @description: 对象默认接口
 * @author: wuyanbo
 * @create: 2019-10-02 18:06
 **/

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);
}
