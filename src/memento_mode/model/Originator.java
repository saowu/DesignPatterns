package memento_mode.model;

/**
 * @description: 发起人类
 * @author: wuyanbo
 * @create: 2019-10-01 21:06
 **/

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("state=" + state);
    }
}
