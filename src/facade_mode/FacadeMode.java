package facade_mode;

import facade_mode.model.Fund;

/**
 * @description: 外观模式
 * @author: wuyanbo
 * @create: 2019-04-17 10:23
 **/

public class FacadeMode {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
