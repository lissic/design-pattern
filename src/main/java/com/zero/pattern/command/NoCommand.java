package main.java.com.zero.pattern.command;

/**
 * @author zero
 * @description NoCommand 空命令，用于初始化
 * @date 2022/5/11 16:00
 */
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
