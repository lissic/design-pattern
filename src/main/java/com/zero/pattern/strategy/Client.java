package main.java.com.zero.pattern.strategy;

/**
 * @author zero
 * @description Client 策略模式
 * @date 2022/5/17 15:13
 */
public class Client {
    public static void main(String[] args) {
        //声明一个具体的策略
        IStrategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行封装后的方法
        context.operate();
    }
}

