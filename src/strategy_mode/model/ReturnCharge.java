package strategy_mode.model;

/**
 * @description: 返利收费
 * @author: wuyanbo
 * @create: 2019-04-09 12:32
 **/

public class ReturnCharge extends BaseCharge {

    //满返标准
    private double moneyCondition = 0.0d;
    //返利值
    private double moneyReturn = 0.0d;

    @Override
    public double settlement(double money) {
        double result = money;
        if (money >= moneyCondition && moneyCondition != 0) {
            result = result - (int)(money / moneyCondition) * moneyReturn;
        }
        return result;
    }


    public ReturnCharge(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
}
