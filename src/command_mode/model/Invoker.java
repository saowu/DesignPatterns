package command_mode.model;

/**
 * @description: 要求该命令执行这个请求
 * @author: wuyanbo
 * @create: 2019-10-09 17:06
 **/

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
