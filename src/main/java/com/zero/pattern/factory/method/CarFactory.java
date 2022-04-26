package main.java.com.zero.pattern.factory.method;

/**
 * @author zero
 * @description CarFactory
 * @date 2022/4/26 15:31
 */
public abstract class CarFactory {
    public abstract Car createCar(String type);
}
