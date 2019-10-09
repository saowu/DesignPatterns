package command_mode;

import command_mode.model.Command;
import command_mode.model.ConcreteCommand;
import command_mode.model.Invoker;
import command_mode.model.Receiver;

/**
 * @description: 命令模式
 * @author: wuyanbo
 * @create: 2019-10-09 16:57
 **/

public class CommandMode {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
