package main.java.com.zero.pattern.command;

/**
 * @author zero
 * @description LightOnCommand
 * @date 2022/5/11 15:56
 */
public class LightOnCommand implements Command{
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        // 执行具体的命令
        lightReceiver.on();
    }

    @Override
    public void undo() {
        // 执行具体的命令
        lightReceiver.off();
    }
}
