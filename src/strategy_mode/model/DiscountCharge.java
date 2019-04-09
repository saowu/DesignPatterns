package strategy_mode.model;

/**
 * @description: 打折收费
 * @author: wuyanbo
 * @create: 2019-04-09 12:27
 **/

public class DiscountCharge extends BaseCharge {

    //折扣数：1折，2折等
    private double moneyRebate = 1d;


    @Override
    public double settlement(double money) {
        return money * moneyRebate;
    }

    public DiscountCharge(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }
}
