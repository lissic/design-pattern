package main.java.com.zero.pattern.factory.simple;

/**
 * @author zero
 * @description CarStore 简单工厂模式
 * @date 2022/4/26 14:53
 */
public class CarStore {
    public static void main(String[] args) {
        CarSimpleFactory factory = new CarSimpleFactory();
        Car audi = factory.createCar("Audi");
        audi.run();
    }
}
