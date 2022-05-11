package main.java.com.zero.pattern.command;

/**
 * @author zero
 * @description LightOffCommand
 * @date 2022/5/11 15:59
 */
public class LightOffCommand implements Command{
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }
    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
