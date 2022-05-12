package main.java.com.zero.pattern.visitor;

/**
 * @author zero
 * @description Action
 * @date 2022/5/12 15:14
 */
public abstract class Action {
    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
