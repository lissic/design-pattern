package main.java.com.zero.pattern.visitor;

/**
 * @author zero
 * @description Man
 * @date 2022/5/12 15:16
 */
public class Man extends Person{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
