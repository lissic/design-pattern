package main.java.com.zero.pattern.state;

/**
 * @author zero
 * @description LiftState
 * @date 2022/5/17 14:49
 */
public abstract class LiftState {
    //定义一个环境角色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    //首先电梯门开启动作
    public abstract void open();

    //电梯门有开启，那当然也就有关闭了
    public abstract void close();

    //电梯要能上能下，运行起来
    public abstract void run();

    //电梯还要能停下来
    public abstract void stop();
}
