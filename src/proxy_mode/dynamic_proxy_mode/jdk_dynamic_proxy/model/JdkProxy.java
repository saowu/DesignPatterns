package proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 代理类
 * @author: wuyanbo
 * @create: 2019-04-12 14:17
 **/

public class JdkProxy implements InvocationHandler {

    //被代理对象
    private Object target = null;

    /**
     * 建立代理关系
     *
     * @param target 被代理对象
     * @return 代理对象
     */
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 代理方法逻辑
     *
     * @param proxy  代理对象实例(不知道干神魔用)
     * @param method 方法
     * @param args   方法参数
     * @return 代理结果
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("进入代理方法前");
        Object invoke = method.invoke(target, args);
        System.out.println("调用代理方法后");

        return invoke;
    }
}
