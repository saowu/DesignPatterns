package singleton_mode;

/**
 * @description: 枚举（线程安全）
 * <p>
 * 自由串行化；保证只有一个实例；线程安全。
 * 《Effective Java》 作者所提倡的方法，近乎完美，在继承场景下不适用。
 * @author: wuyanbo
 * @create: 2019-10-07 09:03
 **/

public enum Singleton5 {
    INSTANCE;

    public void method() {
    }
}
//调用Singleton5.INSTANCE.method();即可