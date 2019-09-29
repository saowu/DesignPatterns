package state_mode.model;

/**
 * @description: 上午的工作状态
 * @author: wuyanbo
 * @create: 2019-09-29 12:30
 **/

public class ForenoonStare extends State {


    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点 上午工作，精神百倍");
        } else {
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
