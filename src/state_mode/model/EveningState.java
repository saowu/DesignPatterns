package state_mode.model;

/**
 * @description: 晚间工作状态
 * @author: wuyanbo
 * @create: 2019-09-29 12:48
 **/

public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点 加班，疲惫");
            } else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
