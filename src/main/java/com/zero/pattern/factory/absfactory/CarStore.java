package main.java.com.zero.pattern.factory.absfactory;

/**
 * @author zero
 * @description CarStore 抽象工厂方法模式
 * @date 2022/4/26 14:53
 */
public class CarStore {
    public static void main(String[] args) {
        // 创建对象使用具体的工厂
        CarFactory audiCarFactory = new AudiCarFactory();
        Car suv = audiCarFactory.createCar("SUV");
        suv.run();
        audiCarFactory.modifyCar(suv);
    }
}
