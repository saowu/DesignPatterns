package singleton_mode;

/**
 * @description: 懒汉式双重校验锁法（通常线程安全，不可保证完全安全）
 * <p>
 * 使用同步代码块避免了第二种方法的效率低的问题，但此方法并不能完全起到线程同步的作用，
 * 与上面第一种方法产生的问题相似，多线程访问时可能产生多个对象。
 * @author: wuyanbo
 * @create: 2019-10-07 09:19
 **/

public class Singleton6 {
    private static Singleton6 singleton6;

    private Singleton6() {
    }

    public static Singleton6 getSingleton6() {
        if (singleton6 == null) {
            synchronized (Singleton6.class) {
                if (singleton6 == null) {
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}
