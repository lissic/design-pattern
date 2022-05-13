package main.java.com.zero.pattern.observer;

/**
 * @author zero
 * @description CurrentConditions
 * @date 2022/5/13 16:01
 */
public class CurrentConditions implements Observer{
    private float temperature;
    private float pressure;
    private float humidity;

    protected void display() {
        System.out.println("今天的温度是：" + temperature);
        System.out.println("今天的气压是：" + pressure);
        System.out.println("今天的湿度是：" + humidity);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
