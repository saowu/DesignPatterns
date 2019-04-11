package decorative_mode;

import decorative_mode.model.BigTrouser;
import decorative_mode.model.Persion;
import decorative_mode.model.Sneaker;
import decorative_mode.model.TShirts;

/**
 * @description: 装饰模式
 * @author: wuyanbo
 * @create: 2019-04-11 12:42
 **/

public class DecorativeMode {

    public static void main(String[] args) {
        Persion jack = new Persion("Jack");
        TShirts tShirts = new TShirts(jack);
        BigTrouser bigTrouser = new BigTrouser(tShirts);
        Sneaker sneaker = new Sneaker(bigTrouser);


        sneaker.show();


    }
}
