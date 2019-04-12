package proxy_mode.dynamic_proxy_mode.cglib_dynamic_proxy;

import proxy_mode.dynamic_proxy_mode.cglib_dynamic_proxy.model.CglibProxy;
import proxy_mode.dynamic_proxy_mode.cglib_dynamic_proxy.model.Suitors;

/**
 * @description: cglib动态代理
 * @author: wuyanbo
 * @create: 2019-04-12 14:36
 **/

public class CglibDynamicProxy {
    public static void main(String[] args) {

        Suitors proxy = (Suitors) new CglibProxy().getProxy(Suitors.class);

        proxy.giveFlowers();

    }
}
