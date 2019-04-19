package observer_mode.model;

/**
 * @description: 前台小姐
 * @author: wuyanbo
 * @create: 2019-04-19 20:25
 **/

public class Reception extends BaseSubject {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
