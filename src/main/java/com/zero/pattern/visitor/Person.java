package main.java.com.zero.pattern.visitor;

/**
 * @author zero
 * @description Person
 * @date 2022/5/12 15:16
 */
public abstract class Person {
    public abstract void accept(Action action);
}
