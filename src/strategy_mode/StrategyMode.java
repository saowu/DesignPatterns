package strategy_mode;

/**
 * @description: 策略模式+简单工厂模式实现商场促销
 * @author: wuyanbo
 * @create: 2019-04-09 12:06
 **/

public class StrategyMode {
    public static void main(String[] args) {
        ChargeContext chargeContext = new ChargeContext(TypeEnum.RETURN_100);
        double result = chargeContext.getResult(500);
        System.out.println(result);
    }
}
