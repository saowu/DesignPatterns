package decorative_mode.model;

/**
 * @description: 人物类
 * @author: wuyanbo
 * @create: 2019-04-11 12:44
 **/

public class Persion extends Component {
    private String name;


    public Persion(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的" + name);
    }
}
