package iterator_mode;

import iterator_mode.model.ConcreteAggregate;
import iterator_mode.model.ConcreteIterator;

import java.util.Iterator;

/**
 * @description: 迭代器模式启动类
 * @author: wuyanbo
 * @create: 2019-10-04 19:40
 **/

public class IteratorMode {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.element(0, "张三");
        concreteAggregate.element(1, "李四");
        concreteAggregate.element(2, "王五");
        concreteAggregate.element(3, "赵六");
        concreteAggregate.element(4, "田七");
        ConcreteIterator concreteIterator = new ConcreteIterator(concreteAggregate);
        Object item = concreteIterator.first();
        System.out.println("No.1=" + item);
        while (!concreteIterator.isDone()) {
            System.out.println(concreteIterator.currentItem());
            concreteIterator.next();
        }
    }
}
