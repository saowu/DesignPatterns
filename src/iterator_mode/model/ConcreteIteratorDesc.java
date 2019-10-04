package iterator_mode.model;

/**
 * @description: 从后往前遍历的迭代器
 * @author: wuyanbo
 * @create: 2019-10-04 20:26
 **/

public class ConcreteIteratorDesc extends Iterator {


    private ConcreteAggregate concreteAggregate;

    private int current = 0;

    public ConcreteIteratorDesc(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.current = concreteAggregate.count() - 1;
    }

    @Override
    public Object first() {
        return concreteAggregate.element(concreteAggregate.count() - 1);
    }

    @Override
    public Object next() {
        Object ret = null;
        current--;
        if (current >= 0) {
            ret = concreteAggregate.element(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current < 0 ? true : false;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.element(current);
    }
}
