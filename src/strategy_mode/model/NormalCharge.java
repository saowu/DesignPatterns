package strategy_mode.model;

/**
 * @description: 正常收费（无折扣）
 * @author: wuyanbo
 * @create: 2019-04-09 12:18
 **/

public class NormalCharge extends BaseCharge {

    @Override
    public double settlement(double money) {
        return money;
    }
}
