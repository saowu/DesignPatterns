package iterator_mode.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 具体聚集类
 * @author: wuyanbo
 * @create: 2019-10-04 19:53
 **/

public class ConcreteAggregate extends Aggregate {

    private List<Object> list = new ArrayList<Object>();

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count() {
        return list.size();
    }

    public Object element(int index) {
        return list.get(index);
    }

    public Object element(int index, Object object) {
        if ((list.size() - 1) >= index) {
            return list.set(index, object);
        } else if (list.size() == index) {
            list.add(index, object);
            return list.get(index);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
