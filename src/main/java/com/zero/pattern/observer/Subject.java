package main.java.com.zero.pattern.observer;


/**
 * @author zero
 * @description Subject
 * @date 2022/5/13 15:59
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
