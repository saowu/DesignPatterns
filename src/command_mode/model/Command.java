package command_mode.model;

/**
 * @description: 声明执行操作的接口
 * @author: wuyanbo
 * @create: 2019-10-09 16:58
 **/

public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
