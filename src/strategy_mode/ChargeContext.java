package strategy_mode;

import strategy_mode.model.BaseCharge;
import strategy_mode.model.DiscountCharge;
import strategy_mode.model.NormalCharge;
import strategy_mode.model.ReturnCharge;

/**
 * @description: 策略算法上下文引用，策略和简单工厂结合
 * @author: wuyanbo
 * @create: 2019-04-09 12:40
 **/

public class ChargeContext {
    BaseCharge baseCharge = null;

    /**
     * 利用简单工厂实例化不同的对象
     *
     * @param type 打折类型
     */
    public ChargeContext(TypeEnum type) {
        switch (type.getNumber()) {
            case 1:
                baseCharge = new NormalCharge();
                break;
            case 2:
                baseCharge = new DiscountCharge(0.8);
                break;
            case 3:
                baseCharge = new ReturnCharge(300, 100);
                break;
        }
    }

    /**
     * 调用子类打折算法
     *
     * @param money
     * @return
     */
    public double getResult(double money) {
        return baseCharge.settlement(money);
    }
}
