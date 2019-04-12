package proxy_mode.static_proxy_mode;

import proxy_mode.static_proxy_mode.model.Proxy;
import proxy_mode.static_proxy_mode.model.Suitors;

/**
 * @description: 静态代理方式
 * @author: wuyanbo
 * @create: 2019-04-12 14:01
 **/

public class StaticProxyMode {

    public static void main(String[] args) {
        Suitors jack = new Suitors("Jack");
        Proxy proxy = new Proxy(jack);
        proxy.giveFlowers();
    }
}
