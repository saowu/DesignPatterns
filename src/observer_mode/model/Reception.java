package observer_mode.model;

/**
 * @description: 前台通知者
 * @author: wuyanbo
 * @create: 2019-04-19 20:25
 **/

public class Reception extends BaseSubject {

    private String name;

    private Boss boss;


    public Reception(String name) {
        this.name = name;
    }


    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void notifyObserver() {
        System.out.println(name + "通知:" + boss.getName() + "回来了！");
        super.notifyObserver();
    }
}
