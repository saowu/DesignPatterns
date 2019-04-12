package proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy.model;


/**
 * @description: 追求者（送礼物者）
 * @author: wuyanbo
 * @create: 2019-04-12 14:06
 **/

public class Suitors implements IGiveGift {

    private String name;


    public Suitors(String name) {
        this.name = name;
    }

    @Override
    public void giveFlowers() {
        System.out.println(name + "送鲜花");
    }

    @Override
    public void call() {
        System.out.println(name + "打电话");
    }


}
