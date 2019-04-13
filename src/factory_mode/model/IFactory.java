package factory_mode.model;

/**
 * @description: 运算工厂接口
 * @author: wuyanbo
 * @create: 2019-04-13 17:31
 **/
public interface IFactory {
    /**
     * 创建运算实例
     *
     * @return 运算父类
     */
    Operation createOperation();
}
