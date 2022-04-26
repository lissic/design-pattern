package main.java.com.zero.pattern.factory.absfactory;

/**
 * @author zero
 * @description Car
 * @date 2022/4/26 14:38
 */
public abstract class Car {

    public abstract void setCarName();

    public void run() {
        setCarName();
        System.out.println("汽车跑起来！！");
    }
}
