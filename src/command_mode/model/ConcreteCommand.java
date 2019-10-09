package command_mode.model;

/**
 * @description: 将一个接收者绑定于一个动作，调用接收者相应的操作，以实现execute
 *
 * @author: wuyanbo
 * @create: 2019-10-09 17:01
 **/

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
