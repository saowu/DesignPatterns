package singleton_mode;

/**
 * @description: 懒汉式（线程安全，同步方法，不推荐使用）
 * <p>
 * 针对懒汉式的线程不安全，自然会想到给 getSingleton() 进行 synchronized 加锁来保证线程同步。
 * 不足：效率低。大多数情况下这个锁占用的额外资源都浪费了，每个线程在想获得类的实例时候，执行 getSingleton() 方法都要进行同步。
 * @author: wuyanbo
 * @create: 2019-10-07 08:47
 **/

public class Singleton2 {

    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getSingleton2() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
