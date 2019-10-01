package memento_mode;

import memento_mode.model.Caretaker;
import memento_mode.model.Originator;

/**
 * @description: 备忘录模式启动类
 * @author: wuyanbo
 * @create: 2019-10-01 21:04
 **/

public class MementoMode {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.getMemento());
    }
}
