package main.java.com.zero.pattern.factory.absfactory;

/**
 * @author zero
 * @description CarFactory
 * @date 2022/4/26 15:31
 */
public interface CarFactory {
    Car createCar(String type);
    void modifyCar(Car car);
}
