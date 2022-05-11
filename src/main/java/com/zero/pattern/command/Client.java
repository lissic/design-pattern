package main.java.com.zero.pattern.command;

/**
 * @author zero
 * @description Client
 * @date 2022/5/11 16:12
 */
public class Client {
    public static void main(String[] args) {
        // 完成通过遥控器，对电灯的操作
        // 创建电灯对象
        LightReceiver lightReceiver = new LightReceiver();
        // 创建命令对象
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        // 创建控制器
        RemoteController remoteController = new RemoteController();
        // 设置命令
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        // 执行命令
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.undoButtonWasPushed();

    }
}
