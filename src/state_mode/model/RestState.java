package state_mode.model;

/**
 * @description: 下班休息状态
 * @author: wuyanbo
 * @create: 2019-09-29 12:46
 **/

public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 下班回家了");
    }
}
