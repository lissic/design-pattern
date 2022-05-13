package main.java.com.zero.pattern.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author zero
 * @description WeatherData
 * @date 2022/5/13 16:02
 */
public class WeatherData implements Subject{
    private float temperature;
    private float pressure;
    private float humidity;

    List<Observer> observers = new ArrayList<>();

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
