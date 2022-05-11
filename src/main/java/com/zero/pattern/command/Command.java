package main.java.com.zero.pattern.command;

/**
 * @author zero
 * @description Command
 * @date 2022/5/11 15:55
 */
public interface Command {
    void execute();
    void undo();
}
