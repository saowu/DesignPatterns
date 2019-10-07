package singleton_mode;

/**
 * @description: 懒汉式（线程不安全）
 * <p>
 * 其主要表现在单例类在外部需要创建实例化对象时再进行实例化，进而达到Lazy Loading 的效果。
 * 通过静态方法 getSingleton() 和private 权限构造方法为创建一个实例化对象提供唯一的途径。
 * 不足：未考虑到多线程的情况下可能会存在多个访问者同时访问，发生构造出多个对象的问题，所以在多线程下不可用这种方法。
 * @author: wuyanbo
 * @create: 2019-10-07 08:44
 **/

public class Singleton1 {
    private static Singleton1 singleton1;

    private Singleton1() {
    }

    public static Singleton1 getSingleton1() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}
