package main.java.com.zero.pattern.observer;

/**
 * @author zero
 * @description Client
 * @date 2022/5/13 16:09
 */
public class Client {
    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData subject = new WeatherData();
        subject.registerObserver(currentConditions);
        subject.setData(30, 110, 20);
        subject.notifyObservers();
    }
}
