package main.java.com.zero.pattern.factory.method;

/**
 * @author zero
 * @description AudiCarFactory
 * @date 2022/4/26 15:32
 */
public class AudiCarFactory extends CarFactory{
    @Override
    public Car createCar(String type) {
        Car car = null;
        if ("SUV".equals(type)) {
            car = new AudiSuvCar();
        } else {
            car = new AudiSportCar();
        }
        return car;
    }
}
