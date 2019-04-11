package decorator_mode;

import decorator_mode.model.BigTrouser;
import decorator_mode.model.Persion;
import decorator_mode.model.Sneaker;
import decorator_mode.model.TShirts;

/**
 * @description: 装饰模式
 * @author: wuyanbo
 * @create: 2019-04-11 12:42
 **/

public class DecoratorMode {

    public static void main(String[] args) {
        Persion jack = new Persion("Jack");
        TShirts tShirts = new TShirts(jack);
        BigTrouser bigTrouser = new BigTrouser(tShirts);
        Sneaker sneaker = new Sneaker(bigTrouser);


        sneaker.show();


    }
}
