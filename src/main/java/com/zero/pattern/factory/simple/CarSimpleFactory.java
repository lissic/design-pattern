package main.java.com.zero.pattern.factory.simple;

/**
 * @author zero
 * @description CarSimpleFactory
 * @date 2022/4/26 14:35
 */
public class CarSimpleFactory {

    Car car = null;
    public Car createCar(String brand) {
        if ("Audi".equals(brand)) {
            car = new AudiCar();
        } else if ("Benz".equals(brand)) {
            car = new BenzCar();
        } else {
            car = new AutoCar();
        }
        return car;
    }
}
