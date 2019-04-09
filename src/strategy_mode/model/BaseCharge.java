package strategy_mode.model;

/**
 * @description: 收费算法抽象父类
 * @author: wuyanbo
 * @create: 2019-04-09 12:11
 **/

public abstract class BaseCharge {

    /**
     * 结算费用
     *
     * @param money 原价
     * @return 实际收费
     */
    public abstract double settlement(double money);
}
