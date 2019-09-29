package state_mode.model;

/**
 * @description: 下午工作状态
 * @author: wuyanbo
 * @create: 2019-09-29 12:42
 **/

public class AfternoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点 下午状态还不错，继续努力");
        } else {
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
