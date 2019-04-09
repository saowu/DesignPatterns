package simple_factory_mode;

import simple_factory_mode.model.Operation;

import java.util.Scanner;

/**
 * @description: 简单工厂模式实现计算器
 * @author: wuyanbo
 * @create: 2019-04-08 12:07
 **/

public class SimpleFactoryMode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        char c = scanner.next().charAt(0);
        double b = scanner.nextDouble();

        Operation operation = OperationFactory.createOperation(c);
        operation.setNumberA(a);
        operation.setNumberB(b);

        System.out.println(operation.getResult());

    }

}
