package main.java.com.zero.pattern.memento;

/**
 * @author zero
 * @description CareTaker
 * @date 2022/5/16 15:03
 */
public class CareTaker {
    // 如果有多个状态需要保存，则可以使用集合的方式进行保存
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
