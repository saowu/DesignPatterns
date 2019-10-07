package singleton_mode;

/**
 * @description: 使用 ThreadLocal 实现（线程安全）
 * <p>
 * ThreadLocal 会为每一个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突。
 * 对于多线程资源共享的问题，同步机制采用了“以时间换空间”的方式，而ThreadLocal 采用了“以空间换时间”的方式。
 * 前者仅提供一份变量，让不同的线程排队访问，而后者为每一个线程都提供了一份变量，因此可以同时访问而互不影响。
 * @author: wuyanbo
 * @create: 2019-10-07 09:27
 **/

public class Singleton8 {
    //    private static final ThreadLocal<Singleton8> singleton8 = new
//            ThreadLocal<Singleton8>() {
//                @Override
//                protected Singleton8 initialValue() {
//                    return new Singleton8();
//                }
//            };
    private static final ThreadLocal<Singleton8> singleton8 = ThreadLocal.withInitial(() -> new Singleton8());

    private Singleton8() {
    }

    public static Singleton8 getSingleton8() {
        return singleton8.get();
    }
}
