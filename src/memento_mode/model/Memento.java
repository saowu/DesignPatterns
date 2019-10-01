package memento_mode.model;

/**
 * @description: 备忘录类
 * @author: wuyanbo
 * @create: 2019-10-01 21:07
 **/

public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
