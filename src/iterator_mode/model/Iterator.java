package iterator_mode.model;

/**
 * @description: 迭代器抽象类
 * @author: wuyanbo
 * @create: 2019-10-04 19:43
 **/

public abstract class Iterator {

    /**
     * 得到开始对象
     *
     * @return
     */
    public abstract Object first();

    /**
     * 得到下一对象
     *
     * @return
     */
    public abstract Object next();

    /**
     * 是否到结尾
     *
     * @return
     */
    public abstract boolean isDone();

    /**
     * 当前对象
     *
     * @return
     */
    public abstract Object currentItem();
}
