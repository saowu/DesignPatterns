package singleton_mode;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @description: 使用CAS 锁实现（线程安全）
 * @author: wuyanbo
 * @create: 2019-10-07 09:34
 **/

public class Singleton9 {

    private static final AtomicReference<Singleton9> INSTANCE = new AtomicReference<Singleton9>();

    private Singleton9() {
    }

    public static final Singleton9 getInstance() {
        for (; ; ) {
            Singleton9 current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new Singleton9();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
