package main.java.com.zero.pattern.visitor;

/**
 * @author zero
 * @description Woman
 * @date 2022/5/12 15:16
 */
public class Woman extends Person{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
