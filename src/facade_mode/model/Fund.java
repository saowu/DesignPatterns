package facade_mode.model;

/**
 * @description: 基金类
 * <p>
 * 股民对证券相关知识不了解，基金就是专业管理人员为众多股民管理资金
 * 基金经理用股民的钱去做投资，收益归股民
 * 经理人只收取少量管理费
 * @author: wuyanbo
 * @create: 2019-04-17 10:24
 **/

public class Fund {
    Stock stock = null;
    NationalDebt nationalDebt = null;
    Realty realty = null;

    public Fund() {
        if (stock == null) {
            stock = new Stock();
        }
        if (nationalDebt == null) {
            nationalDebt = new NationalDebt();
        }
        if (realty == null) {
            realty = new Realty();
        }

    }

    public void sellFund() {
        stock.sell();
        nationalDebt.sell();
        realty.sell();

    }

    public void buyFund() {
        stock.buy();
        nationalDebt.buy();
        realty.buy();
    }
}
