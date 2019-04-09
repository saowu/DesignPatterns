package strategy_mode;

/**
 * @description: 收费折扣类型
 * @author: wuyanbo
 * @create: 2019-04-09 12:40
 **/
public enum TypeEnum {

    NORMAL("正常收费", 1),
    DISCOUNT_8("打8折", 2),
    RETURN_100("满300减100", 3);


    private String typeNume;
    private int number;

    private TypeEnum(String typeNume, int number) {
        this.typeNume = typeNume;
        this.number = number;
    }

    public String getTypeNume() {
        return typeNume;
    }

    public int getNumber() {
        return number;
    }
}
