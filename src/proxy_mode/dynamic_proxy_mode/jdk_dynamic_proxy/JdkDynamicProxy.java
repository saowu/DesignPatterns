package proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy;

import proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy.model.IGiveGift;
import proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy.model.JdkProxy;
import proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy.model.Suitors;


/**
 * @description: jdk动态代理
 * @author: wuyanbo
 * @create: 2019-04-12 14:13
 **/

public class JdkDynamicProxy {

    public static void main(String[] args) {
        Suitors jack = new Suitors("jack");
        IGiveGift iGiveGift = (IGiveGift) new JdkProxy().bind(jack);
        iGiveGift.call();
    }
}
