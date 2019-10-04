package iterator_mode.model;

/**
 * @description: 具体迭代器类
 * @author: wuyanbo
 * @create: 2019-10-04 19:52
 **/

public class ConcreteIterator extends Iterator {

    private ConcreteAggregate concreteAggregate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return concreteAggregate.element(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current++;
        if (current < concreteAggregate.count()) {
            ret = concreteAggregate.element(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.element(current);
    }
}
