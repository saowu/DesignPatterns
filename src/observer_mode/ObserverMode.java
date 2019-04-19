package observer_mode;

import observer_mode.model.Boss;
import observer_mode.model.Employee;
import observer_mode.model.Reception;

/**
 * @description: 观察者模式
 * <p>
 * 员工们想偷偷休息，向前台R1报名，一但发现老板，马上通知他们
 * @author: wuyanbo
 * @create: 2019-04-19 19:23
 **/

public class ObserverMode {
    public static void main(String[] args) {

        Boss huhansan = new Boss("胡汉三");

        Reception reception = new Reception("R1");

        //向R1报名
        reception.attach(new Employee("E1"));
        reception.attach(new Employee("E2"));
        reception.attach(new Employee("E3"));
        //发现老板
        reception.setBoss(huhansan);
        //立即通知
        reception.notifyObserver();
    }
}
