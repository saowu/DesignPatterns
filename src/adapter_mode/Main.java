package adapter_mode;

import adapter_mode.model.Adapter;
import adapter_mode.model.Target;

/**
 * @description: 适配器启动类
 * @author: wuyanbo
 * @create: 2019-09-30 20:00
 **/

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
