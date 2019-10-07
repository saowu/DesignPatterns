package singleton_mode;

/**
 * @description: 懒汉式双重检查终极版（面试手写推荐）
 * <p>
 * 与第六种方法不同的是，此方法给singleton 的声明上加了关键字 volatile ，进而解决了低概率的线程不安全问题。
 * volatile 起到禁止指令重排的作用，在它赋值完成之前，就不会调用读操作（singleton == null）。
 * @author: wuyanbo
 * @create: 2019-10-07 09:22
 **/

public class Singleton7 {

    private static volatile Singleton7 singleton7;

    private Singleton7() {
    }

    public static Singleton7 getSingleton7() {
        if (singleton7 == null) {
            synchronized (Singleton6.class) {
                if (singleton7 == null) {
                    singleton7 = new Singleton7();
                }
            }
        }
        return singleton7;
    }
}
