package memento_mode.model;

/**
 * @description: 管理者类
 * @author: wuyanbo
 * @create: 2019-10-01 21:10
 **/

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
