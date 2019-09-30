package adapter_mode.model;

/**
 * @description: 适配器类
 * @author: wuyanbo
 * @create: 2019-09-30 19:57
 **/

public class Adapter implements Target {
    //内部包装一个Adaptee对象，将源接口转接成目标接口
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.spcificRequest();
    }
}
