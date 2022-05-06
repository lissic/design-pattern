package main.java.com.zero.pattern.prototype;

import java.io.Serializable;

/**
 * @author zero
 * @description Car
 * @date 2022/5/6 16:21
 */
public class Car implements Serializable, Cloneable {
    public String name;
    public Person driver;

    public Car() {
        super();
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        Car clone = (Car)super.clone();
        clone.driver  = clone.driver.clone();
        return clone;
    }
}
