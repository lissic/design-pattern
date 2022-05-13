package main.java.com.zero.pattern.observer;

/**
 * @author zero
 * @description Observer
 * @date 2022/5/13 16:00
 */
public interface Observer {
    void update(float temperature, float pressure, float humidity);
}
