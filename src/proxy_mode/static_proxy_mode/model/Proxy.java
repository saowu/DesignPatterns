package proxy_mode.static_proxy_mode.model;

/**
 * @description: 代理类
 * @author: wuyanbo
 * @create: 2019-04-12 14:09
 **/

public class Proxy implements IGiveGift {


    private IGiveGift target;

    public Proxy(IGiveGift target) {
        this.target = target;
    }

    @Override
    public void giveFlowers() {
        target.giveFlowers();
    }
}
