package main.java.com.zero.pattern.factory.method;

/**
 * @author zero
 * @description AudiCarFactory
 * @date 2022/4/26 15:32
 */
public class BenzCarFactory extends CarFactory{
    @Override
    public Car createCar(String type) {
        Car car = null;
        if ("SUV".equals(type)) {
            car = new BenzSuvCar();
        } else {
            car = new BenzSportCar();
        }
        return car;
    }
}
