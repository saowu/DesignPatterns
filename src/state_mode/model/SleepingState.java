package state_mode.model;

/**
 * @description: 睡眠状态
 * @author: wuyanbo
 * @create: 2019-09-29 12:44
 **/

public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 不行了，睡着了");
    }
}
