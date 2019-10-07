package singleton_mode;

/**
 * @description: 饿汉式（线程安全）
 * <p>
 * 在进行类加载时完成实例化对象的过程就是饿汉式的形式。
 * 避免了线程同步问题，在运行这个类的时候进行加载，之后直接访问
 * 不足：相比接下来的静态内部类而言，这种方法比静态内部类多了内存常驻，容易造成内存浪费，也未达到延迟加载的效果。
 * @author: wuyanbo
 * @create: 2019-10-07 08:53
 **/

public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getSingleton3() {
        return singleton3;
    }
}
