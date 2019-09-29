package state_mode;

import state_mode.model.Work;

/**
 * @description: 状态模式启动类
 * @author: wuyanbo
 * @create: 2019-09-29 12:27
 **/

public class StateMode {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);

        work.setFinish(false);

        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setHour(22);
        work.writeProgram();

    }
}
