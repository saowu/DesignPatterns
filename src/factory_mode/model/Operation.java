package factory_mode.model;

/**
 * @description: 运算类
 * @author: wuyanbo
 * @create: 2019-04-08 13:49
 **/

public class Operation {
    private double numberA;
    private double numberB;
    public double result = 0;

    /**
     * 计算结果，需要子类重写
     *
     * @return 结果
     */
    public double getResult() {
        return 0;
    }


    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }


    public Operation() {
    }

    public Operation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                ", result=" + result +
                '}';
    }
}
