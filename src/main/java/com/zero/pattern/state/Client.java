package main.java.com.zero.pattern.state;

/**
 * @author zero
 * @description Client 状态模式
 * @date 2022/5/17 14:12
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
