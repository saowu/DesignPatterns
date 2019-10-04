package iterator_mode.model;

/**
 * @description:聚集抽象类
 * @author: wuyanbo
 * @create: 2019-10-04 19:47
 **/

public abstract class Aggregate {
    /**
     * 创建迭代器
     *
     * @return
     */
    public abstract Iterator createIterator();
}
