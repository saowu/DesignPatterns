package observer_mode.model;

/**
 * @description: 员工观察者
 * @author: wuyanbo
 * @create: 2019-04-19 20:28
 **/

public class Employee extends BaseObserver {


    private String name;


    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "结束休息，继续工作。");
    }

}
