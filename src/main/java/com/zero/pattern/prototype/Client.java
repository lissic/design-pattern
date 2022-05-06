package main.java.com.zero.pattern.prototype;

/**
 * @author zero
 * @description Client
 * @date 2022/5/6 15:51
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*Person person = new Person("zero", 18);
        Person clone = person.clone();
        System.out.println(person);
        System.out.println(clone);*/
        // 深拷贝方式
        Car car = new Car();
        car.name = "奔驰";
        car.driver = new Person("Zero", 19);
        Car clone = car.clone();

        System.out.println(car.driver.hashCode());
        System.out.println(clone.driver.hashCode());
    }
}
