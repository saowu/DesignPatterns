package proxy_mode.static_proxy_mode.model;

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
}
