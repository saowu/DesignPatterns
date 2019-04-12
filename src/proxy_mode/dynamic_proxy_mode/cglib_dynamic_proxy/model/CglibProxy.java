package proxy_mode.dynamic_proxy_mode.cglib_dynamic_proxy.model;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description: 代理类
 * @author: wuyanbo
 * @create: 2019-04-12 14:38
 **/

public class CglibProxy implements MethodInterceptor {

    /**
     * 生成cglib代理对象
     *
     * @param cls 被代理对象类
     * @return 被代理对象类对象
     */
    public Object getProxy(Class cls) {
        //Enhancer主要的增强类
        Enhancer enhancer = new Enhancer();
        //设置增强类型
        enhancer.setSuperclass(cls);
        //定义代理逻辑对象为当前对象
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /**
     * 代理逻辑方法
     * 表示调用原始类的被拦截到的方法。这个方法的前后添加需要的过程。在这个方法中，我们可以在调用原方法之前或之后注入自己的代码。
     * 由于性能的原因，对原始方法的调用使用CGLIB的net.sf.cglib.proxy.MethodProxy对象，而不是反射中一般使用java.lang.reflect.Method对象。
     *
     * @param proxy       被代理对象
     * @param method      方法
     * @param objects     方法参数
     * @param methodProxy 方法代理
     * @return 代理逻辑返回
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用方法前");
        Object invoke = methodProxy.invokeSuper(proxy, objects);
        System.out.println("调用方法后");
        return invoke;
    }
}
