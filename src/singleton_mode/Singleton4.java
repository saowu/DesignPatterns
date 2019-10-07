package singleton_mode;

/**
 * @description: 静态内部类加载（线程安全）
 * <p>
 * 静态内部类不会在单例加载时加载，当调用 getInstance() 方法时才会进行加载，达到类似懒汉式效果，并且也是线程安全的。
 * 类的静态属性只会在第一次加载类时进行初始化，所以上面的方法JVM帮助我们保证了线程的安全性，在类进行初始化时，其他线程无法进入。
 * @author: wuyanbo
 * @create: 2019-10-07 08:56
 **/

public class Singleton4 {

    private Singleton4() {
    }

    private static class SingletonInner {
        private static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonInner.instance;
    }
}
