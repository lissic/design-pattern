package main.java.com.zero.pattern.strategy;

/**
 * @author zero
 * @description ConcreteStrategy1
 * @date 2022/5/17 16:01
 */
public class ConcreteStrategy2 implements IStrategy{
    @Override
    public void operate() {
        System.out.println("具体策略2的运算法则");
    }
}
